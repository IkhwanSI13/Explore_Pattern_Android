package id.yukngoding.domain

import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

abstract class UseCase<T, Params>(
    private val jobScheduler: Scheduler = Schedulers.io(),
    private val postScheduler: Scheduler = AndroidSchedulers.mainThread()
) {

    private var disposable: Disposable? = null

    abstract fun buildUseCase(params: Params): Observable<T>

    fun execute(params: Params, onSuccess: (T) -> Unit, onError: (Throwable) -> Unit) {
        disposable = buildUseCase(params)
            .subscribeOn(jobScheduler)
            .observeOn(postScheduler)
            .subscribe(
                { onSuccess(it) },
                { onError(it) },
                { dispose() }
            )
    }

    fun dispose() {
        disposable?.dispose()
    }

    class None()
}
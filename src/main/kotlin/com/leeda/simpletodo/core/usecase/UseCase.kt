package com.leeda.simpletodo.core.usecase

interface UseCase<in I : UseCase.Request, out O : UseCase.Response> {

    fun execute(request: I): O

    interface Request
    interface Response
}
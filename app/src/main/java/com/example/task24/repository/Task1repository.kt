package com.example.task24.repository

import com.example.task24.date.ApiManager

class Task1repository {
}

class UserManager(private val repository: ApiManager) {
    fun getDataUser(userName: String): String {
        return repository.fichData(userName)

    }
}

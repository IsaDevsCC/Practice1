package domain.usecase

import android.content.Context
import com.example.practice1.databinding.ActivityLoginBinding
import data.repositories.LoginRepository
import data.repositories.model.LoginModel

class GetLoginUseCase(
    private val loginRepository : LoginRepository
) {

    fun checkLogin(user : LoginModel, context : Context)  {
        loginRepository.getLogin(user, context)
    }

    fun loadLogin(binding: ActivityLoginBinding, context: Context) {
        loginRepository.loadLogin(binding, context)
    }
}
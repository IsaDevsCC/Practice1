package presentation.login

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.practice1.databinding.ActivityLoginBinding
import data.repositories.model.LoginModel
import domain.usecase.GetLoginUseCase

class LoginViewModel(
    private val useCase: GetLoginUseCase
) : ViewModel() {

    // TODO cargar preferences
    fun loadPreferences(binding: ActivityLoginBinding, context: Context) {
        useCase.loadLogin(binding, context)
    }

    //TODO -> CHECKING LOGIN Y ALMACENAR EN CASO DE EMPTY
    fun checkLogin(user : LoginModel, context : Context) {  // puede realizarse con el context?
        useCase.checkLogin(user, context)
    }

}
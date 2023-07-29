package presentation.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.practice1.databinding.ActivityLoginBinding
import data.repositories.model.LoginModel

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val viewModel : LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        createView()
    }

    private fun createView() {

        with(binding){
            viewModel.loadPreferences(binding, root.context)
            btLogin.isEnabled = etPassword.text.toString().isNotEmpty() && etUser.text.toString().isNotEmpty()
            val user = LoginModel(etUser.text.toString(), etPassword.text.toString())

            btLogin.setOnClickListener {
                viewModel.checkLogin(user, root.context)
            }
        }
    }
}
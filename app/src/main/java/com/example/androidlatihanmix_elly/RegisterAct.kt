package com.example.androidlatihanmix_elly

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.register_activity.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.toast

class RegisterAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        btn_regis.setOnClickListener {
            val name = et_inputNama.text.toString().trim()
            val email = et_inputEmail.text.toString().trim()
            val pass = et_inputPassword.text.toString().trim()
            val confirm = et_inputConfirm.text.toString().trim()
            handlingForRegister(name, email, pass, confirm)
        }

    }
    private fun handlingForRegister(uname : String, email : String, pass : String, confirm : String){
        when{
            uname.isEmpty()-> toast("username kosong")
            email.isEmpty() -> ("email kosong")
            pass.isEmpty()->("password kosong")
            confirm.isEmpty() ->("confirm kosong")
            else -> alert(title = "REGISTRASI", message = "User Berhasil Registrasi"){
                positiveButton(buttonText = "OK"){
                    onBackPressed()
                    finish()
                }
                isCancelable = false
            }.show()
        }
    }
}
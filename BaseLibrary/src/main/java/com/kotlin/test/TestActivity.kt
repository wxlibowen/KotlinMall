package com.kotlin.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.solver.widgets.ConstraintHorizontalLayout
import android.widget.Toast
import com.kotlin.base.R
import kotlinx.android.synthetic.main.activity_test_activty.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_test_activty)
        verticalLayout {
            padding=30
            editText {
                hint="请输入姓名"
                textSize=24f

            }
            editText {
                hint="请输入年龄"
                textSize=24f
            }
            button {
                text = "测试"
                onClick {
                    toast(intent.getStringExtra("name"))
                }
            }
        }
//        mShowTV.text=intent.getStringExtra("name")
    }

}

package com.example.animalbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animalbook.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    lateinit var binding: ActivitySubBinding
    lateinit var title: TitleFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lionButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                // フラグメントの入れ替えを行う
                replace(R.id.container, LionFragment())
                // 今回のフラグメントの処理をバックスタックに追加する（バックスタックに名前を付けない場合はnull）
                addToBackStack(null)
                // トランザクションを確定する
                commit()
            }
        }

        binding.hippoButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                // フラグメントの入れ替えを行う
                replace(R.id.container, HippoFragment())
                // 今回のフラグメントの処理をバックスタックに追加する（バックスタックに名前を付けない場合はnull）
                addToBackStack(null)
                // トランザクションを確定する
                commit()
            }
        }

        binding.giraffeButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                // フラグメントの入れ替えを行う
                replace(R.id.container, GiraffeFragment())
                // 今回のフラグメントの処理をバックスタックに追加する（バックスタックに名前を付けない場合はnull）
                addToBackStack(null)
                // トランザクションを確定する
                commit()
            }
        }

        // タイトルを表示する領域を確保する
        title = TitleFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.titleFrame, title)
            commit()
        }

        binding.backButton.setOnClickListener {
            finish()
        }
    }

    // タイトルを表示させる
    override fun onResume() {
        super.onResume()
        title.setTitle(getString(R.string.subTitle))
    }

}
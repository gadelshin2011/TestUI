package com.example.myapplication.screen

import com.example.myapplication.R
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton

class MyProjectScreen:Screen<MyProjectScreen>() {
    var tvName = KEditText {withId(R.id.tvName)}
    var tvSurname = KEditText {withId(R.id.tvSurname)}
    var buttonSend = KButton { withId(R.id.btClickSend) }
}
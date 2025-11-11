package br.edu.utfpr.cc.setac.pb.talk.data.model

import java.sql.Timestamp

class User {

    val uid: String = ""
    val email: String = ""
    val displayName: String = ""
    val photoUrl: String? = null
    val createdAt: Timestamp = Timestamp.now()
    val lastSeen: TimesStamp = Timestamp.now()
    val isOnline: Boolean = false

}
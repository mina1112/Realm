package app.kato.nim.realm

import android.app.Application
import android.content.Context
import io.realm.Realm
import io.realm.RealmConfiguration

class RealmMemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(realmConfig)
    }
    }

package appstuio60.billardboard;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Nicolaj Pedersen on 16-12-2017.
 */

public class BillardApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Realm. Should only be done once when the application starts.
        Realm.init(this);
    }
}

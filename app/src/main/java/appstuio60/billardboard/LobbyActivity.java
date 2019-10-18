package appstuio60.billardboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import appstuio60.billardboard.model.Person;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by Nicolaj Pedersen on 19-07-2017.
 */
public class LobbyActivity extends AppCompatActivity {

    private Person user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        initiateDataFromDb();
    }




    public void createUser(){

    }

    public void setUser(Person user){
        this.user = user;
    }

    public void initiateDataFromDb() {
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                RealmResults<Person> users = realm.where(Person.class).findAll();
                if(users == null){
                    createUser();
                }else{
                    setUser(users.first());
                }

            }
        });

    }
}

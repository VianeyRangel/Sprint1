package mx.edu.utng.vgutierrez.videodolores;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button btnLogout;
    private  Session session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        session = new Session(this);
        if (!session.loggedin()){
            logout();
        }
        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });


    }

    private void logout(){
        session.setLoggedin(false);
        finish();
        startActivity(new Intent(Main2Activity.this, LoginActivity.class));
    }
    public void next_video (View view){
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }

    public void next_crafts (View view){
        Intent intent = new Intent(Main2Activity.this, HandicraftsActivity.class);
        startActivity(intent);
    }
}

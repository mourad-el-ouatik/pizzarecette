package pizza.recette;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import pizza.recette.ui.ListPizzaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // splash screen

        // Passer à la liste après 2.5 secondes
        new Handler().postDelayed(() -> {
            startActivity(new Intent(MainActivity.this, ListPizzaActivity.class));
            finish();
        }, 2500);
    }
}
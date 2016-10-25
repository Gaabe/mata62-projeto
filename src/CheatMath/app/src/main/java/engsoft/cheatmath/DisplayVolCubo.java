package engsoft.cheatmath;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class DisplayVolCubo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_vol_cubo);
    }

    public void calculate(View view){
        EditText editText = (EditText) findViewById(R.id.editAresta);
        int aresta = Integer.parseInt(editText.getText().toString());
        Cubo cubo = new Cubo();
        cubo.setAresta(aresta);
        int resultado = cubo.calculate_volume();
        String result = Integer.toString(resultado);
        TextView textView = (TextView) findViewById(R.id.textResultado);
        textView.setText(result);
        TextView solucao = (TextView) findViewById(R.id.textSolucao);
        solucao.setText(cubo.show_result());

    }

    public void favorite(View view){
        SharedPreferences sharedPref = this.getSharedPreferences(getString(R.string.favorites), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(getString(R.string.favorites), "volume cubo");
        editor.commit();
        Toast.makeText(getApplicationContext(), "Formula adicionada aos favoritos", Toast.LENGTH_SHORT).show();
    }
}

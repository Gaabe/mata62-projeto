package engsoft.cheatmath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayVolCubo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_vol_cubo);
    }

    public void calculate(View view){
        EditText editText = (EditText) findViewById(R.id.editAresta);
        System.out.println("integer:");
        System.out.println(editText.getText().toString());
        int aresta = Integer.parseInt(editText.getText().toString());
        Cubo cubo = new Cubo();
        cubo.setAresta(aresta);
        int resultado = cubo.calculate_volume();
        String result = Integer.toString(resultado);
        TextView textView = (TextView) findViewById(R.id.textResultado);
        textView.setText(result);

    }
}

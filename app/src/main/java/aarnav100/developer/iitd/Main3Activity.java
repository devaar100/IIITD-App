package aarnav100.developer.iitd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
//TODO:edit textview designs
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView tv1=(TextView)findViewById(R.id.tv1);
        TextView tv2=(TextView)findViewById(R.id.tv2);
        TextView tv3=(TextView)findViewById(R.id.tv3);
        View.OnClickListener ocl=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.tv1:
                        break;
                    case R.id.tv2:
                        break;
                    case R.id.tv3:
                        break;
                }
                startActivity(new Intent(Main3Activity.this,Main4Activity.class));
            }
        };
    }
}

package upmc.musicsearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    //Constant to identify the Intent
    public final static String EXTRA_MESSAGE = "upmc.request.MESSAGE";

    //standard onCreate method
    //linking the activity_main layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //sendMessage is the callback called by a click onto the Button 'send'
    public void sendMessage(View view) {
        //get the edit_message EditText object
         EditText editText = (EditText)findViewById(R.id.edit_message);

        //get its user's message (artist name request)
         String message =  editText.getText().toString();

        //Create the explicit intent (to start DisplayMessageActivity activity) //pour lancer l'activité display message activity
         Intent intent = new Intent(this, DisplayMessageActivity.class);

        //add an extra (the message)
        intent.putExtra("message",message);

        //start activity !
        // ??
    }
}

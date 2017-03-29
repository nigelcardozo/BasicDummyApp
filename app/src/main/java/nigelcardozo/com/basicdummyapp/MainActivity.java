package nigelcardozo.com.basicdummyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * MainActivity.
 *
 * Basic application purely created for testing some github interaction
 *
 * @author Nigel Cardozo
 * @version 1.0 (current Prog Version)
 * @since 1.0   (version of the package in which this class was added)
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayToast(getString(R.string.whoop));
        
    }

    /**
     * Method used to process information delivered within the broadcast receiver call.
     *
     * @param message message to display.
     * @return None
     *
     */
    private void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}

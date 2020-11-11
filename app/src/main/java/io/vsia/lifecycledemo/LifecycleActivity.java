package io.vsia.lifecycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LifecycleActivity extends AppCompatActivity {

    EditText inputText;
    TextView outputText;
    String TAG = getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        inputText = findViewById(R.id.txtInput);
        outputText = findViewById(R.id.txtOutput);

        if (savedInstanceState != null) {
            outputText.setText(savedInstanceState.getString("text"));
        }

        Log.d(TAG, "Methode onCreate wird aufgerufen");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Methode onStart wird aufgerufen");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Methode onRestart wird aufgerufen");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Methode onResume wird aufgerufen");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Methode onPause wird aufgerufen");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Methode onStop wird aufgerufen");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Methode onDestroy wird aufgerufen");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("text", outputText.getText().toString());
        Log.d(TAG, "Methode onSaveInstanceState wird aufgerufen");
    }

    public void updateText(View view) {
        String text = inputText.getText().toString();
        outputText.setText(text);
    }
}

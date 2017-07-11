package com.waveview.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.john.waveview.WaveView;

/**
 * Created by kai.wang on 6/17/14.
 */
public class MainActivity extends Activity {

    private SeekBar seekBar,seekBar1;
    private WaveView waveView,waveView1;
    private TextView textView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        textView = (TextView) findViewById(R.id.editText);
        seekBar = (SeekBar) findViewById(R.id.seek_bar);
        seekBar1 = (SeekBar) findViewById(R.id.seek_bar1);
        waveView = (WaveView) findViewById(R.id.wave_view);
        waveView1 = (WaveView) findViewById(R.id.wave_view1);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                waveView.setProgress(progress);
                textView.setText(String.valueOf(progress));
                Log.i("s",String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                waveView1.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
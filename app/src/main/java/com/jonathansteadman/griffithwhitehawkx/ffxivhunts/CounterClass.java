
package com.jonathansteadman.griffithwhitehawkx.ffxivhunts;

import java.util.concurrent.TimeUnit;

import android.content.Context;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.widget.TextView;

public class CounterClass extends CountDownTimer {

    String hms;

    Context mContext;
    TextView mTextView;

    //pass textview as argument from HuntsListFragment to counter class
    public CounterClass(Context mContext, long millisInFuture, long countDownInterval, TextView tv) {
        super(millisInFuture, countDownInterval);
        this.mContext = mContext;
        mTextView = tv;
    }

    @Override
    // need to test this - 
    public void onFinish() {
        hms = "OPEN";
        if (mTextView != null) {
            mTextView.setText(hms);
            mTextView.setTextColor(Color.GREEN);
        }
    }

    @Override
    public void onTick(long millisUntilFinished) {
        long millis = millisUntilFinished;
        hms = String.format(
                "%02d:%02d:%02d",
                TimeUnit.MILLISECONDS.toHours(millis),
                TimeUnit.MILLISECONDS.toMinutes(millis)
                        - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                TimeUnit.MILLISECONDS.toSeconds(millis)
                        - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
        System.out.println(hms);
        // null check the textview, then set the text as the counter clock string
        if (mTextView != null) {
            mTextView.setText(hms);
            mTextView.setTextColor(Color.RED);
        }
    }

}

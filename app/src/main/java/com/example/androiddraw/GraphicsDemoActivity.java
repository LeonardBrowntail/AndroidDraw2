package com.example.androiddraw;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class GraphicsDemoActivity extends Activity {
    ImageView ourView;
    // This is the entry point to our game
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        draw();
        setContentView(ourView);
    }

    public void draw()
    {
        Bitmap blankBitmap;
        blankBitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);

        Canvas canvas;
        canvas = new Canvas(blankBitmap);

        ourView = new ImageView(this);
        ourView.setImageBitmap(blankBitmap);

        Paint paint;
        paint = new Paint();

        Bitmap bitmapTank;
        bitmapTank = BitmapFactory.decodeResource(this.getResources(), R.drawable.tank);

        canvas.drawColor(Color.argb(255,46,186,186));
        paint.setColor(Color.argb(255, 255, 150, 63));

        canvas.drawCircle(540, 960,300, paint);
        canvas.drawRect(0,990, 1080,930, paint);

        paint.setColor(Color.argb(255,46,186,186));
        canvas.drawCircle(540, 960,250, paint);

        paint.setColor(Color.argb(255, 255, 150, 63));
        canvas.drawText("Prototype Tank", 300,1400, paint);

        canvas.drawBitmap(bitmapTank, 80, 560, paint);
    }


}
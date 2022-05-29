package com.hungphamcom.lab5_gangnamstyle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    Bitmap[] frames=new Bitmap[9];
    int i=0;

    public GraphicsView(Context context) {
        super(context);
        frames[0]= BitmapFactory.decodeResource(getResources(),R.drawable.letter_1);
        frames[1]= BitmapFactory.decodeResource(getResources(),R.drawable.letter_2);
        frames[2]= BitmapFactory.decodeResource(getResources(),R.drawable.letter_3);
        frames[3]= BitmapFactory.decodeResource(getResources(),R.drawable.letter_4);
        frames[4]= BitmapFactory.decodeResource(getResources(),R.drawable.letter_5);
        frames[5]= BitmapFactory.decodeResource(getResources(),R.drawable.letter_6);
        frames[6]= BitmapFactory.decodeResource(getResources(),R.drawable.letter_7);
        frames[7]= BitmapFactory.decodeResource(getResources(),R.drawable.letter_8);
        frames[8]= BitmapFactory.decodeResource(getResources(),R.drawable.letter_9);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(i<8){
            canvas.drawBitmap(frames[i],40,40,new Paint());
        }else {
            i=0;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        return true;
    }
}

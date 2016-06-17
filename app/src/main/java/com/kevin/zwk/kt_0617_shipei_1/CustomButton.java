package com.kevin.zwk.kt_0617_shipei_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/6/17.
 */
public class CustomButton extends View {
    /**
     * 自定义view中必须存在构造函数
     *
     * @param context
     */
    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 绘制方法 当自定义view被使用绘制控件的外观内容时回调的对象
     *
     * @param canvas 画布对象 该对象中提供了绘制不同图形的方法
     *               调用该对象中的方法绘制不同的图形
     *               paint 画笔 提供类对绘制图形的属性（线条颜色 宽度）的设置 和画布对象结合使用
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.BLUE);//设置画布颜色

       /* Paint paint=new Paint();//创建画笔对象
        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);
        canvas.drawLine(0,0,100,200,paint);*/

        /*Paint paint=new Paint();
        paint.setTextSize(100);
        paint.setColor(Color.GREEN);
        canvas.drawText("我是按钮",120,200,paint);*/

        Paint paint = new Paint();
        Paint paint1 = new Paint();
        paint1.setColor(Color.RED);
        paint.setColor(Color.GREEN);
        paint.setAntiAlias(true);//设置抗锯齿


        canvas.drawCircle(500, 500, 200, paint);


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int wmode = MeasureSpec.getMode(widthMeasureSpec);
        int hmode = MeasureSpec.getMode(heightMeasureSpec);

        int wsize = MeasureSpec.getSize(widthMeasureSpec);
        int hsize = MeasureSpec.getMode(heightMeasureSpec);

        switch (wmode) {
            case MeasureSpec.AT_MOST:
                wsize = 100;
                break;
            case MeasureSpec.EXACTLY:
                hsize = 500;
                break;
        }
        switch (hmode) {
            case MeasureSpec.AT_MOST:
                hsize = 200;
                break;
            case MeasureSpec.EXACTLY:
                hsize = 700;
                break;
        }
        setMeasuredDimension(wsize, hsize);
    }
}

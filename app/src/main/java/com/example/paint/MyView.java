package com.example.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class MyView extends View {
    public MyView(Context context){
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas){
  /*  Paint p = new Paint();
    p.setColor(Color.RED);
    p.setStrokeWidth(20);
    p.setAntiAlias(true);
    p.setStyle(Paint.Style.FILL);
    canvas.drawPaint(p);

    p.setColor(Color.YELLOW);
    p.setStyle(Paint.Style.STROKE);
    canvas.drawCircle(300, 300, 100, p);
    canvas.drawLine(300, 300, 600, 600, p);
    p.setTextSize(60);
    canvas.drawText("Всем привет, я тут рисую, если не нравится, то закрой приложение!", 40, 40, p);

    Path path = new Path();
    path.moveTo(100, 100);
    path.lineTo(200, 200);
    path.close();
canvas.drawPath(path, p);
*/

Paint sun = new Paint();
        sun.setColor(Color.BLUE);
        sun.setStrokeWidth(20);

        Paint green = new Paint();
        green.setColor(Color.GREEN);
        green.setStrokeWidth(20);
        green.setAntiAlias(true);
        green.setStyle(Paint.Style.FILL);
        canvas.drawPaint(green);

        green.setColor(Color.GREEN);
        green.setStyle(Paint.Style.FILL);




        sun.setAntiAlias(true);
        sun.setStyle(Paint.Style.FILL);
        canvas.drawPaint(sun);

        sun.setColor(Color.YELLOW);
        sun.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0, 0, 300, sun);
        canvas.drawRect(-550, 1000, 1500, 5000, green);

        Paint ray = new Paint();

        ray.setColor(Color.YELLOW);
        ray.setStyle(Paint.Style.STROKE);
        ray.setStrokeWidth(40);


        canvas.drawLine(0, 0, 600, 600, ray);
canvas.rotate(10);


        canvas.drawLine(0, 0, 600, 600, ray);
        canvas.rotate(20);


        canvas.drawLine(0, 0, 600, 600, ray);
        canvas.rotate(30);

        canvas.drawLine(0, 0, 800, 800, ray);
        canvas.rotate(40);

        canvas.drawLine(0, 0, 600, 600, ray);
        canvas.rotate(50);



        canvas.drawLine(0, 0, 600, 600, ray);
        canvas.rotate(-10);


        canvas.drawLine(0, 0, 600, 600, ray);
        canvas.rotate(-20);


        canvas.drawLine(0, 0, 600, 600, ray);
        canvas.rotate(-30);
        canvas.drawLine(0, 0, 600, 600, ray);
        canvas.rotate(-40);

        canvas.drawLine(0, 0, 600, 600, ray);
        canvas.rotate(-50);


  /*      Path path = new Path();
        path.moveTo(100, 100);
        path.lineTo(200, 200);
        path.close();
        canvas.drawPath(path, ray);

   */


 //   canvas.drawOval();

    }

}

package com.sxm.example.quotetextview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/**
 * 自定义ImageSpan，使图片和文字水平对齐
 * Created by shixiaoming on 17/12/7.
 */

public class AlignTextSpan extends ImageSpan {

    public AlignTextSpan(Drawable b, int verticalAlignment) {
        super(b, verticalAlignment);

    }

    @Override
    public void draw(Canvas canvas, CharSequence text,
                     int start, int end, float x,
                     int top, int y, int bottom, Paint paint) {
        Drawable b = getDrawable();
        Paint.FontMetricsInt fm = paint.getFontMetricsInt();
        int transY = (y + fm.descent + y + fm.ascent) / 2 - b.getBounds().bottom / 2;//计算y方向的位移
        canvas.save();
        canvas.translate(x, transY);//绘制图片位移一段距离
        b.draw(canvas);
        canvas.restore();
    }

}

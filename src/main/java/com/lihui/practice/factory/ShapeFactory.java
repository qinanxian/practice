package com.lihui.practice.factory;

import com.lihui.practice.service.Shape;
import com.lihui.practice.service.impl.Circle;
import com.lihui.practice.service.impl.Rectangle;
import com.lihui.practice.service.impl.Square;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
    /**
     * 创建一个工厂，使用getShape方法根据传入的参数获取每个形状的实现类方法。
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null && "".equals(shapeType)) {
            return null;
        }
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

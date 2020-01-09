package GuiLearn.BasicEstablishment;

import javax.swing.*;
import java.awt.*;

/*
* JLabel，标签。标签主要用于展示 文本 或 图片，也可以 同时显示文本和图片。

JLabel 的构造方法:

/*
构造方法中的参数含义:
    text: 标签显示的 文本
    image: 标签显示的 图片
    horizontalAlignment: 标签内容（在标签内）的水平对其方式（竖直方向默认居中, 可通过方法设置）

    JLabel()

    JLabel(String text)

    JLabel(String text, int horizontalAlignment)

    JLabel(Icon image)

    JLabel(Icon image, int horizontalAlignment)

    JLabel(String text, Icon image, int horizontalAlignment)

JLabel 的常用方法:
    // 设置 文本 和 图片
            void setText(String text)
            void setIcon(Icon icon)

    // 设置文本相对于图片的位置（文本默认在图片右边垂直居中）
            void setHorizontalTextPosition(int textPosition)
            void setVerticalTextPosition(int textPosition)

    // 设置标签内容（在标签内）的对其方式（默认左对齐并垂直居中）
            void setHorizontalAlignment(int alignment)
            void setVerticalAlignment(int alignment)

    // 设置图片和文本之间的间隙
            void setIconTextGap(int iconTextGap)


下面的方法定义在 JComponent 基类中
    // 设置文本的字体类型、样式 和 大小
            void setFont(Font font)

    // 设置字体颜色
            void setForeground(Color fg)

    // 当鼠标移动到组件上时显示的提示文本
            void setToolTipText(String text)

    // 设置组件的背景
            void setBackground(Color bg)

    // 设置组件是否可见
            void setVisible(boolean visible)

    // 设置组件是否为 不透明，JLabel默认为透明，设置为不透明后才能显示背景
            void setOpaque(boolean isOpaque)

    // 设置组件的 首选 大小
            void setPreferredSize(Dimension preferredSize)

    // 设置组件的 最小 大小
            void setMinimumSize(Dimension minimumSize)

    // 设置组件的 最大 大小
            void setMaximumSize(Dimension maximumSize)

    //上面的对齐参数具体的取值常量参考 DocsApi；
    //setXXX(...) 方法往往都对应着 getXXX() 方法。

显示图片时，Icon实例的创建（一般创建ImageIcon，ImageIcon 实现了 Icon）:
ImageIcon 的构造方法:
    // 使用 本地路径 图片创建 ImageIcon
            ImageIcon(String filename)

    // 使用 网络路径 图片创建 ImageIcon
            ImageIcon(URL location)

    // 使用图片文件的字节数组创建 ImageIcon
            ImageIcon(byte[] imageData)

    // 使用 java.awt.Image 实例创建 ImageIcon
            ImageIcon(java.awt.Image image)
* */
public class JLabelLearn {

    public static void main(String[] args) {
        //TODO 学习使用 JLabel

        JFrame jf = new JFrame("测试窗口");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建内容面板，默认使用流式布局
        JPanel panel = new JPanel();

        /*
         * 只显示文本
         */
        JLabel label01 = new JLabel();
        label01.setText("Only Text");
        label01.setFont(new Font(null, Font.PLAIN, 25));  // 设置字体，null 表示使用默认字体
        panel.add(label01);

        /*
         * 只显示图片
         */
        JLabel label02 = new JLabel();
        label02.setIcon(new ImageIcon("D:/IdeaProjects/JavaGUILearn/src/GuiLearn/img/demo01.jpg"));
        panel.add(label02);

        /*
         * 同时显示文本和图片
         */
        JLabel label03 = new JLabel();
        label03.setText("文本和图片");
        label03.setIcon(new ImageIcon("D:/IdeaProjects/JavaGUILearn/src/GuiLearn/img/demo02.jpg"));
        label03.setHorizontalTextPosition(SwingConstants.CENTER);   // 水平方向文本在图片中心
        label03.setVerticalTextPosition(SwingConstants.BOTTOM);     // 垂直方向文本在图片下方
        panel.add(label03);

        jf.setContentPane(panel);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}

package GuiLearn.LayoutManagement;

import javax.swing.*;
import java.awt.*;

public class FlowlayoutDes {

    public static void main(String[] args) {
        //TODO 流式布局
        //创建一个小窗口,并设置窗口名称
        JFrame jFrame = new JFrame("Small Designer");
        //设置窗体大小
        jFrame.setSize(200, 250);
        //设置默认退出窗体模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体的相对位置
        jFrame.setLocationRelativeTo(null);

        // 创建内容面板，指定使用 流式布局
        // 流式布局的特点,一行一行的排,排满了之后就向下排
        // panel轻量级面板组建
        JPanel panel = new JPanel(new FlowLayout());

        JButton btn01 = new JButton("按钮01");
        JButton btn02 = new JButton("按钮02");
        JButton btn03 = new JButton("按钮03");
        JButton btn04 = new JButton("按钮04");
        JButton btn05 = new JButton("按钮05");

        panel.add(btn01);
        panel.add(btn02);
        panel.add(btn03);
        panel.add(btn04);
        panel.add(btn05);

        //设置内窗体
        jFrame.setContentPane(panel);
        //渲染
        jFrame.setVisible(true);        // PS: 最后再设置为可显示(绘制), 所有添加的组件才会显示
    }
}

package Applet;

import java.net.InetAddress;

public class CustomApplet {
    /*
    Applet 类中的四个方法给你提供了一个框架，你可以再该框架上开发小程序：

    init: 该方法的目的是为你的 Applet 提供所需的任何初始化。在 Applet 标记内的 param 标签被处理后调用该方法。

    start: 浏览器调用 init 方法后，该方法被自动调用。每当用户从其他页面返回到包含 Applet 的页面时，则调用该方法。

    stop: 当用户从包含 Applet 的页面移除的时候，该方法自动被调用。因此，可以在相同的 Applet 中反复调用该方法。

    destroy: 此方法仅当浏览器正常关闭时调用。因为 Applet 只有在 HTML 网页上有效，所以你不应该在用户离开包含 Applet 的页面后遗漏任何资源。

    paint: 该方法在 start() 方法之后立即被调用，或者在 Applet 需要重绘在浏览器的时候调用。paint() 方法实际上继承于 java.awt。*/

    public static void main(String[] args)
            throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        String hostname;
        System.out.println("Local HostAddress: "+ addr.getHostAddress());
                hostname = addr.getHostName();
        System.out.println("Local host name: "+hostname);
    }
}

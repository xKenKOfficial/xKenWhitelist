package x.KenKOfficial.Whitelist.Main;

import org.bukkit.plugin.java.*;
import x.KenKOfficial.Whitelist.Files.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.plugin.*;
import org.bukkit.*;
import org.bukkit.event.*;
import x.KenKOfficial.Whitelist.Listeners.*;
import x.KenKOfficial.Whitelist.Commands.*;
import org.bukkit.command.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ String[] I;
    private static /* synthetic */ Main plugin;
    /* synthetic */ WhitelistFile wf;
    private static final /* synthetic */ int[] l;
    
    private static void ll() {
        (I = new String[Main.l[16]])[Main.l[0]] = I("DIUpqcIbjXYMhSmpwhuNdgyFKanCG412DIUpqcIbjXYMhSmpwhuNdgyFKanCG412DIUpqcIbjXZSRdUCcqXvxA==", "HLJsg");
        Main.I[Main.l[1]] = l("NSEDJDglAxIvAyQZEg==", "MjfJo");
        Main.I[Main.l[2]] = l("Ew0BEhMqBklBS2tYXiMfMQk=", "Ehsaz");
        Main.I[Main.l[3]] = Il("dv7fynGYJtrqSJHrmYrEXw==", "ewYXw");
        Main.I[Main.l[4]] = l("DykpUQsqLiQYIClnMR8qbg4+FzwnKTcUIyspJFEhKGcTHj43NTkWJjpnfVEeHAgYOAwHExU1bw==", "NGPqN");
        Main.I[Main.l[5]] = Il("JFnQ8nImwY8kWdDycibBjyRZ0PJyJsGPJFnQ8nImwY8kWdDycibBjyRZ0PJyJsGPJFnQ8nImwY9nuwDCAjZmxw==", "Ypgav");
        Main.I[Main.l[6]] = l("cWJGUWdxYkZRZ3FiRlFncWJGUWdxYkZRZ3FiRlFncWJGUWdxYkZRZ3FiRlFncWJGUWdxYkZRZ3FiRlE=", "RAerD");
        Main.I[Main.l[7]] = Il("3p3UIQ6qOyRsI3/2Pi566g==", "bYIll");
        Main.I[Main.l[8]] = Il("+eOPngB6eRwkYKAqV1fB1I4CLrWIl/91", "NfPwT");
        Main.I[Main.l[9]] = Il("pQQWHAhabxA=", "dOZrz");
        Main.I[Main.l[10]] = Il("TDCiY3dVDdLlj8rb5aoQQCwWAsj8VuHB2yw0P8WncFIfD1UNq69OPZ1fBIoZ3NygNIzgZuHt33I=", "kChNq");
        Main.I[Main.l[11]] = I("1n8AKkY+RBHWfwAqRj5EEdZ/ACpGPkQR1n8AKkY+RBHWfwAqRj5EEdZ/ACpGPkQR1n8AKkY+RBGR+UNGvYMUwg==", "FJtkg");
        Main.I[Main.l[12]] = l("CiMnBREoK2YiFyshJw8cNWJoTw==", "FLFax");
        Main.I[Main.l[13]] = I("sYMlmAWojylt9hFeBjXtjw==", "gUIdX");
        Main.I[Main.l[14]] = Il("BPngE8lIboyBEhX05wq5rM7Qc4DoVGON", "Sitcf");
        Main.I[Main.l[15]] = l("Gw0gLi05BWEJKzkEKC0xJQM1Iys5QgcjKDIRb2Rq", "WbAJD");
    }
    
    private static String l(String IIlIIIlllllllll, final String llIIIIlllllllll) {
        IIlIIIlllllllll = new String(Base64.getDecoder().decode(IIlIIIlllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllIIIlllllllll = new StringBuilder();
        final char[] IllIIIlllllllll = llIIIIlllllllll.toCharArray();
        int lIlIIIlllllllll = Main.l[0];
        final byte llllllIllllllll = (Object)IIlIIIlllllllll.toCharArray();
        final char IlllllIllllllll = (char)llllllIllllllll.length;
        float lIllllIllllllll = Main.l[0];
        while (lIl((int)lIllllIllllllll, IlllllIllllllll)) {
            final char IlIlIIlllllllll = llllllIllllllll[lIllllIllllllll];
            lllIIIlllllllll.append((char)(IlIlIIlllllllll ^ IllIIIlllllllll[lIlIIIlllllllll % IllIIIlllllllll.length]));
            "".length();
            ++lIlIIIlllllllll;
            ++lIllllIllllllll;
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllIIIlllllllll);
    }
    
    private static String I(final String lllIlIlllllllll, final String IIIllIlllllllll) {
        try {
            final SecretKeySpec IIlllIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIllIlllllllll.getBytes(StandardCharsets.UTF_8)), Main.l[8]), "DES");
            final Cipher llIllIlllllllll = Cipher.getInstance("DES");
            llIllIlllllllll.init(Main.l[2], IIlllIlllllllll);
            return new String(llIllIlllllllll.doFinal(Base64.getDecoder().decode(lllIlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIllIlllllllll) {
            IlIllIlllllllll.printStackTrace();
            return null;
        }
    }
    
    public Main() {
        this.wf = WhitelistFile.getInstance();
    }
    
    private static boolean lIl(final int lIIlllIllllllll, final int IIIlllIllllllll) {
        return lIIlllIllllllll < IIIlllIllllllll;
    }
    
    public void registerFiles() {
        this.getLogger().info(Main.I[Main.l[15]]);
        this.wf.setup((Plugin)this);
    }
    
    static {
        IIl();
        ll();
    }
    
    public void registerListeners() {
        this.getLogger().info(Main.I[Main.l[14]]);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerLogin(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    public void registerCommands() {
        this.getLogger().info(Main.I[Main.l[12]]);
        this.getCommand(Main.I[Main.l[13]]).setExecutor((CommandExecutor)new WhitelistCommand());
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        this.wf.saveData();
        System.out.println(Main.I[Main.l[6]]);
        System.out.println(Main.I[Main.l[7]]);
        System.out.println(Main.I[Main.l[8]]);
        System.out.println(Main.I[Main.l[9]]);
        System.out.println(Main.I[Main.l[10]]);
        System.out.println(Main.I[Main.l[11]]);
    }
    
    private static String Il(final String IllIIllllllllll, final String llIIIllllllllll) {
        try {
            final SecretKeySpec lIIlIllllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIlIllllllllll = Cipher.getInstance("Blowfish");
            IIIlIllllllllll.init(Main.l[2], lIIlIllllllllll);
            return new String(IIIlIllllllllll.doFinal(Base64.getDecoder().decode(IllIIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllllllllll) {
            lllIIllllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IIl() {
        (l = new int[17])[0] = ((0xDB ^ 0x84 ^ (0x21 ^ 0x46)) & (0xE3 ^ 0x97 ^ (0xC4 ^ 0x88) ^ -" ".length()));
        Main.l[1] = " ".length();
        Main.l[2] = "  ".length();
        Main.l[3] = "   ".length();
        Main.l[4] = (0x9A ^ 0x9E);
        Main.l[5] = (0xC2 ^ 0xC7);
        Main.l[6] = (115 + 13 - 91 + 109 ^ 87 + 29 - 82 + 114);
        Main.l[7] = (0x77 ^ 0x56 ^ (0x29 ^ 0xF));
        Main.l[8] = (121 + 8 - 13 + 14 ^ 124 + 35 - 89 + 68);
        Main.l[9] = (0x3E ^ 0x37);
        Main.l[10] = (0xE5 ^ 0x95 ^ (0x1 ^ 0x7B));
        Main.l[11] = (0x6E ^ 0x59 ^ (0x5A ^ 0x66));
        Main.l[12] = (0x26 ^ 0x2A);
        Main.l[13] = (0x13 ^ 0x51 ^ (0x7C ^ 0x33));
        Main.l[14] = (0xA7 ^ 0xA9);
        Main.l[15] = (0xA0 ^ 0xAF);
        Main.l[16] = (0xB5 ^ 0xA5);
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        this.registerFiles();
        System.out.println(Main.I[Main.l[0]]);
        System.out.println(Main.I[Main.l[1]]);
        System.out.println(Main.I[Main.l[2]]);
        System.out.println(Main.I[Main.l[3]]);
        System.out.println(Main.I[Main.l[4]]);
        System.out.println(Main.I[Main.l[5]]);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
}

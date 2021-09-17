package x.KenKOfficial.Whitelist.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Whitelist.Main.*;
import x.KenKOfficial.Whitelist.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import java.util.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ int[] ll;
    private static final /* synthetic */ String[] Il;
    
    private static String IIIl(final String IIlIIlIllllllll, final String llIIIlIllllllll) {
        try {
            final SecretKeySpec lIIlIlIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIlIlIllllllll = Cipher.getInstance("Blowfish");
            IIIlIlIllllllll.init(PlayerJoin.ll[2], lIIlIlIllllllll);
            return new String(IIIlIlIllllllll.doFinal(Base64.getDecoder().decode(IIlIIlIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIllllllll) {
            lllIIlIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIll(final int IlIIlllIlllllll) {
        return IlIIlllIlllllll != 0;
    }
    
    private static void lIIl() {
        (Il = new String[PlayerJoin.ll[11]])[PlayerJoin.ll[0]] = Ill("AgE6Hx8cMiYWEB0fIhkVGAg=", "rmOxv");
        PlayerJoin.Il[PlayerJoin.ll[1]] = lll("0obvwWXd0J1jZ7h3Gh2QxUs0ziapHqVT", "tLfnb");
        PlayerJoin.Il[PlayerJoin.ll[2]] = Ill("d3tAO1JsfltqUmx+W2pSbH5bajR3cEA7FxomCAAHODcDOwYiN0BvST0eW2pSbH5balJsfltqUmx+", "QCfWo");
        PlayerJoin.Il[PlayerJoin.ll[3]] = lll("2PrzfGLQczI=", "cENLJ");
        PlayerJoin.Il[PlayerJoin.ll[4]] = IIIl("SP2gznipdpZsoCKgBLD/iV7fAw6xsFDaZ6iKNh/ugBI=", "pGjsO");
        PlayerJoin.Il[PlayerJoin.ll[5]] = Ill("eA==", "XOpsX");
        PlayerJoin.Il[PlayerJoin.ll[6]] = Ill("YXN5MQozJicIAWdtdEdJI2RgV0IDMDoG", "AUNgo");
        PlayerJoin.Il[PlayerJoin.ll[7]] = Ill("dg==", "VfrgN");
        PlayerJoin.Il[PlayerJoin.ll[8]] = Ill("R2tzKQIUOWQwEwMsMABFX3dkQwFWempVWkl/dFdSRyorARlJbXVWWVV6", "gMDec");
        PlayerJoin.Il[PlayerJoin.ll[9]] = IIIl("+xI0mRSjRXs=", "XJoGc");
        PlayerJoin.Il[PlayerJoin.ll[10]] = lll("oPMXlaSMdtusc+LEOaOIzWwqx8V0OzqL7SzQ2e9HwQLhfgBzf8/jh+jauh1dJVBYrHPixDmjiM0tKXZ5QnT2uw==", "uliwb");
    }
    
    static {
        IlIl();
        lIIl();
    }
    
    private static void IlIl() {
        (ll = new int[12])[0] = ((0x3F ^ 0x1A ^ (0xBF ^ 0x8E)) & (" ".length() ^ (0xB ^ 0x1E) ^ -" ".length()));
        PlayerJoin.ll[1] = " ".length();
        PlayerJoin.ll[2] = "  ".length();
        PlayerJoin.ll[3] = "   ".length();
        PlayerJoin.ll[4] = (0x64 ^ 0x60);
        PlayerJoin.ll[5] = (83 + 77 - 9 + 21 ^ 64 + 98 - 25 + 32);
        PlayerJoin.ll[6] = (0x22 ^ 0x24);
        PlayerJoin.ll[7] = (0xC7 ^ 0xC0);
        PlayerJoin.ll[8] = (0x2F ^ 0x21 ^ (0x9C ^ 0x9A));
        PlayerJoin.ll[9] = (182 + 118 - 191 + 94 ^ 154 + 97 - 213 + 156);
        PlayerJoin.ll[10] = (0x38 ^ 0x66 ^ (0x96 ^ 0xC2));
        PlayerJoin.ll[11] = (0xC8 ^ 0xC3);
    }
    
    private static boolean lIll(final int lIlIlllIlllllll, final int IIlIlllIlllllll) {
        return lIlIlllIlllllll < IIlIlllIlllllll;
    }
    
    private static boolean llIl(final int lIIllllIlllllll, final int IIIllllIlllllll) {
        return lIIllllIlllllll == IIIllllIlllllll;
    }
    
    private static String Ill(String IIlIIIIllllllll, final String llIIIIIllllllll) {
        IIlIIIIllllllll = new String(Base64.getDecoder().decode(IIlIIIIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllIIIIllllllll = new StringBuilder();
        final char[] IllIIIIllllllll = llIIIIIllllllll.toCharArray();
        int lIlIIIIllllllll = PlayerJoin.ll[0];
        final long lllllllIlllllll = (Object)IIlIIIIllllllll.toCharArray();
        final int IllllllIlllllll = lllllllIlllllll.length;
        char lIlllllIlllllll = (char)PlayerJoin.ll[0];
        while (lIll(lIlllllIlllllll, IllllllIlllllll)) {
            final char IlIlIIIllllllll = lllllllIlllllll[lIlllllIlllllll];
            lllIIIIllllllll.append((char)(IlIlIIIllllllll ^ IllIIIIllllllll[lIlIIIIllllllll % IllIIIIllllllll.length]));
            "".length();
            ++lIlIIIIllllllll;
            ++lIlllllIlllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllIIIIllllllll);
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent llllIlIllllllll) {
        final Player IIIIllIllllllll = llllIlIllllllll.getPlayer();
        if (llIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.Il[PlayerJoin.ll[0]]) ? 1 : 0, PlayerJoin.ll[1]) && IIll(IIIIllIllllllll.hasPermission(PlayerJoin.Il[PlayerJoin.ll[1]]) ? 1 : 0)) {
            IIIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Il[PlayerJoin.ll[2]]));
            IIIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Il[PlayerJoin.ll[3]]));
            IIIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Il[PlayerJoin.ll[4]]));
            IIIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Il[PlayerJoin.ll[5]]));
            IIIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Il[PlayerJoin.ll[6]]));
            IIIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Il[PlayerJoin.ll[7]]));
            IIIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Il[PlayerJoin.ll[8]]));
            IIIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Il[PlayerJoin.ll[9]]));
            IIIIllIllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Il[PlayerJoin.ll[10]]));
        }
    }
    
    private static String lll(final String lllIlIIllllllll, final String IllIlIIllllllll) {
        try {
            final SecretKeySpec IIlllIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIlIIllllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.ll[8]), "DES");
            final Cipher llIllIIllllllll = Cipher.getInstance("DES");
            llIllIIllllllll.init(PlayerJoin.ll[2], IIlllIIllllllll);
            return new String(llIllIIllllllll.doFinal(Base64.getDecoder().decode(lllIlIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIllIIllllllll) {
            IlIllIIllllllll.printStackTrace();
            return null;
        }
    }
}

package x.KenKOfficial.Whitelist.Listeners;

import x.KenKOfficial.Whitelist.Files.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Whitelist.Main.*;
import x.KenKOfficial.Whitelist.Apis.*;
import x.KenKOfficial.Whitelist.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerLogin implements Listener
{
    private static final /* synthetic */ String[] IIl;
    private static final /* synthetic */ int[] lIl;
    static /* synthetic */ WhitelistFile wf;
    
    private static String Illl(final String IIIllIlIlllllll, final String lIIllIlIlllllll) {
        try {
            final SecretKeySpec lIlllIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlllIlIlllllll = Cipher.getInstance("Blowfish");
            IIlllIlIlllllll.init(PlayerLogin.lIl[2], lIlllIlIlllllll);
            return new String(IIlllIlIlllllll.doFinal(Base64.getDecoder().decode(IIIllIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIlIlllllll) {
            llIllIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    @EventHandler
    public void onLogin(final PlayerLoginEvent lIIlIllIlllllll) {
        PlayerLogin.wf = WhitelistFile.getInstance();
        final String IIIlIllIlllllll = Main.getPlugin().getConfig().getString(PlayerLogin.IIl[PlayerLogin.lIl[0]]);
        final String lllIIllIlllllll = Main.getPlugin().getConfig().getString(PlayerLogin.IIl[PlayerLogin.lIl[1]]);
        final Player IllIIllIlllllll = lIIlIllIlllllll.getPlayer();
        if (lIIIl(PlayerLogin.wf.getFile().getBoolean(PlayerLogin.IIl[PlayerLogin.lIl[2]]) ? 1 : 0, PlayerLogin.lIl[1]) && IlIIl(((boolean)API.isWhitelist(IllIIllIlllllll.getName())) ? 1 : 0)) {
            lIIlIllIlllllll.disallow(PlayerLoginEvent.Result.KICK_OTHER, ChatUtil.fixColor(String.valueOf(new StringBuilder().append(IIIlIllIlllllll).append(PlayerLogin.IIl[PlayerLogin.lIl[3]]).append(lllIIllIlllllll))));
        }
    }
    
    private static boolean lIIIl(final int IlIIlIlIlllllll, final int lIIIlIlIlllllll) {
        return IlIIlIlIlllllll == lIIIlIlIlllllll;
    }
    
    private static boolean IlIIl(final int llllIIlIlllllll) {
        return llllIIlIlllllll == 0;
    }
    
    private static void IIIIl() {
        (lIl = new int[5])[0] = ((0xC ^ 0x13) & ~(0x35 ^ 0x2A));
        PlayerLogin.lIl[1] = " ".length();
        PlayerLogin.lIl[2] = "  ".length();
        PlayerLogin.lIl[3] = "   ".length();
        PlayerLogin.lIl[4] = (0x3E ^ 0x75 ^ (0xD3 ^ 0x9C));
    }
    
    private static void llll() {
        (IIl = new String[PlayerLogin.lIl[4]])[PlayerLogin.lIl[0]] = Illl("rktopLoNlDc=", "zEMUs");
        PlayerLogin.IIl[PlayerLogin.lIl[1]] = Illl("FFLzUyutx6nzAafI6nYY1g==", "bbDnU");
        PlayerLogin.IIl[PlayerLogin.lIl[2]] = Illl("/Dp6HmpeDy6lVaqReB4LIp4KkTpTf/oC", "wUaVm");
        PlayerLogin.IIl[PlayerLogin.lIl[3]] = Illl("iBjpEzPiP6A=", "cDfxP");
    }
    
    static {
        IIIIl();
        llll();
        PlayerLogin.wf = WhitelistFile.getInstance();
    }
}

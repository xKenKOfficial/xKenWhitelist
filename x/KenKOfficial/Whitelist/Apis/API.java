package x.KenKOfficial.Whitelist.Apis;

import x.KenKOfficial.Whitelist.Files.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class API
{
    private static final /* synthetic */ String[] Ill;
    static /* synthetic */ WhitelistFile wf;
    private static final /* synthetic */ int[] llIl;
    
    public static Boolean isWhitelist(final String lllIIlIlIllllll) {
        boolean lIIlIlIlIllllll = API.llIl[0] != 0;
        final List<String> IIIlIlIlIllllll = (List<String>)API.wf.getFile().getStringList(API.Ill[API.llIl[5]]);
        lIIlIlIlIllllll = IIIlIlIlIllllll.contains(lllIIlIlIllllll);
        return lIIlIlIlIllllll;
    }
    
    private static String IIlIl(final String IIIIlIIlIllllll, final String llllIIIlIllllll) {
        try {
            final SecretKeySpec llIIlIIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIIlIIlIllllll = Cipher.getInstance("Blowfish");
            IlIIlIIlIllllll.init(API.llIl[2], llIIlIIlIllllll);
            return new String(IlIIlIIlIllllll.doFinal(Base64.getDecoder().decode(IIIIlIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIlIllllll) {
            lIIIlIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIl(String llIllllIIllllll, final String IlIllllIIllllll) {
        llIllllIIllllll = new String(Base64.getDecoder().decode(llIllllIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllllllIIllllll = new StringBuilder();
        final char[] lIlllllIIllllll = IlIllllIIllllll.toCharArray();
        int IIlllllIIllllll = API.llIl[0];
        final short IllIlllIIllllll = (Object)llIllllIIllllll.toCharArray();
        final String lIlIlllIIllllll = (String)IllIlllIIllllll.length;
        boolean IIlIlllIIllllll = API.llIl[0] != 0;
        while (lIlIIl(IIlIlllIIllllll ? 1 : 0, (int)lIlIlllIIllllll)) {
            final char lIIIIIIlIllllll = IllIlllIIllllll[IIlIlllIIllllll];
            IllllllIIllllll.append((char)(lIIIIIIlIllllll ^ lIlllllIIllllll[IIlllllIIllllll % lIlllllIIllllll.length]));
            "".length();
            ++IIlllllIIllllll;
            ++IIlIlllIIllllll;
            "".length();
            if ((0xC2 ^ 0xB3 ^ (0xE8 ^ 0x9D)) <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(IllllllIIllllll);
    }
    
    static {
        IIlIIl();
        IllIl();
        API.wf = WhitelistFile.getInstance();
    }
    
    public static void removeWhitelistPlayer(final String IlIIllIlIllllll) {
        API.wf = WhitelistFile.getInstance();
        final List<String> llIIllIlIllllll = (List<String>)API.wf.getFile().getStringList(API.Ill[API.llIl[2]]);
        llIIllIlIllllll.remove(IlIIllIlIllllll);
        "".length();
        API.wf.getFile().set(API.Ill[API.llIl[3]], (Object)llIIllIlIllllll);
        API.wf.saveData();
    }
    
    private static void IIlIIl() {
        (llIl = new int[8])[0] = ((0x60 ^ 0x2) & ~(0xD2 ^ 0xB0));
        API.llIl[1] = " ".length();
        API.llIl[2] = "  ".length();
        API.llIl[3] = "   ".length();
        API.llIl[4] = (0xF9 ^ 0xBC ^ (0xF2 ^ 0xB3));
        API.llIl[5] = (0x83 ^ 0x86);
        API.llIl[6] = (0x85 ^ 0xB9 ^ (0x35 ^ 0xF));
        API.llIl[7] = (89 + 28 + 28 + 11 ^ 1 + 71 + 23 + 53);
    }
    
    private static void IllIl() {
        (Ill = new String[API.llIl[6]])[API.llIl[0]] = llIIl("FR4mPu/EOlMgppKvOwRsbQ==", "dgHkz");
        API.Ill[API.llIl[1]] = IIlIl("Ox9EiArGshC/mFGtrUaLJw==", "UDPYq");
        API.Ill[API.llIl[2]] = IIlIl("EDq7RxxDXrg5x+phJ5aGOA==", "djwaT");
        API.Ill[API.llIl[3]] = lIlIl("OQYqJSkCBzAlYg8KJyI=", "nnCQL");
        API.Ill[API.llIl[4]] = llIIl("Y0CmzLzhZGmQdDKhfSbC7fr3qY95x2on", "EVPos");
        API.Ill[API.llIl[5]] = llIIl("2ARvX9hZIOO14HO7SbtT/Q==", "mfsBd");
    }
    
    public static void statusWhitelist(final Boolean IlllIlIlIllllll) {
        API.wf = WhitelistFile.getInstance();
        API.wf.getFile().set(API.Ill[API.llIl[4]], (Object)IlllIlIlIllllll);
        API.wf.saveData();
    }
    
    private static String llIIl(final String lIlllIIlIllllll, final String IlIllIIlIllllll) {
        try {
            final SecretKeySpec IIIIIlIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIllIIlIllllll.getBytes(StandardCharsets.UTF_8)), API.llIl[7]), "DES");
            final Cipher lllllIIlIllllll = Cipher.getInstance("DES");
            lllllIIlIllllll.init(API.llIl[2], IIIIIlIlIllllll);
            return new String(lllllIIlIllllll.doFinal(Base64.getDecoder().decode(lIlllIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllllIIlIllllll) {
            IllllIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIl(final int IIIIlllIIllllll, final int llllIllIIllllll) {
        return IIIIlllIIllllll < llllIllIIllllll;
    }
    
    public static void addWhitelistPlayer(final String IIIlllIlIllllll) {
        API.wf = WhitelistFile.getInstance();
        final List<String> lIIlllIlIllllll = (List<String>)API.wf.getFile().getStringList(API.Ill[API.llIl[0]]);
        lIIlllIlIllllll.add(IIIlllIlIllllll);
        "".length();
        API.wf.getFile().set(API.Ill[API.llIl[1]], (Object)lIIlllIlIllllll);
        API.wf.saveData();
    }
}

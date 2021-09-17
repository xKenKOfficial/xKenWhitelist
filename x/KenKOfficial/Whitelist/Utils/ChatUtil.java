package x.KenKOfficial.Whitelist.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ String[] lll;
    private static final /* synthetic */ int[] IIIl;
    
    private static void llIll() {
        (IIIl = new int[9])[0] = ((0x4B ^ 0x4F ^ (0x1D ^ 0x58)) & (89 + 21 - 95 + 200 ^ 31 + 35 + 47 + 37 ^ -" ".length()));
        ChatUtil.IIIl[1] = " ".length();
        ChatUtil.IIIl[2] = "  ".length();
        ChatUtil.IIIl[3] = "   ".length();
        ChatUtil.IIIl[4] = (0xA9 ^ 0xAD);
        ChatUtil.IIIl[5] = (0x13 ^ 0x16);
        ChatUtil.IIIl[6] = (0xC2 ^ 0xC4);
        ChatUtil.IIIl[7] = (0x6E ^ 0xD ^ (0xCB ^ 0xAF));
        ChatUtil.IIIl[8] = (0x38 ^ 0x30);
    }
    
    public static String fixColor(final String lIIlIIlIlllllll) {
        return lIIlIIlIlllllll.replaceAll(ChatUtil.lll[ChatUtil.IIIl[0]], ChatUtil.lll[ChatUtil.IIIl[1]]).replace(ChatUtil.lll[ChatUtil.IIIl[2]], ChatUtil.lll[ChatUtil.IIIl[3]]).replace(ChatUtil.lll[ChatUtil.IIIl[4]], ChatUtil.lll[ChatUtil.IIIl[5]]).replace(ChatUtil.lll[ChatUtil.IIIl[6]], ChatUtil.lll[ChatUtil.IIIl[7]]);
    }
    
    private static String IIIll(final String lIIIIIlIlllllll, final String IIIIIIlIlllllll) {
        try {
            final SecretKeySpec IIlIIIlIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIIIIlIlllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.IIIl[8]), "DES");
            final Cipher llIIIIlIlllllll = Cipher.getInstance("DES");
            llIIIIlIlllllll.init(ChatUtil.IIIl[2], IIlIIIlIlllllll);
            return new String(llIIIIlIlllllll.doFinal(Base64.getDecoder().decode(lIIIIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIIlIlllllll) {
            IlIIIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIlll(final int IIlIlIIIlllllll, final int llIIlIIIlllllll) {
        return IIlIlIIIlllllll < llIIlIIIlllllll;
    }
    
    private static void IlIll() {
        (lll = new String[ChatUtil.IIIl[8]])[ChatUtil.IIIl[0]] = lllIl("FpwWCa6CYuo=", "mxxTp");
        ChatUtil.lll[ChatUtil.IIIl[1]] = IIIll("kd0yRxOlkFk=", "lwpDj");
        ChatUtil.lll[ChatUtil.IIIl[2]] = lllIl("X8Rv/ZOXNa4=", "rnGRz");
        ChatUtil.lll[ChatUtil.IIIl[3]] = lIIll("w6k=", "RjdCK");
        ChatUtil.lll[ChatUtil.IIIl[4]] = IIIll("weB6dFP2vGw=", "kjNzl");
        ChatUtil.lll[ChatUtil.IIIl[5]] = IIIll("QC8mupUvBY0=", "NXwJC");
        ChatUtil.lll[ChatUtil.IIIl[6]] = lIIll("OAwb", "CBfUE");
        ChatUtil.lll[ChatUtil.IIIl[7]] = lllIl("FhHT+1JFMng=", "aFpRR");
    }
    
    private static String lllIl(final String IIlIllIIlllllll, final String lIIIllIIlllllll) {
        try {
            final SecretKeySpec lllIllIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllIllIIlllllll = Cipher.getInstance("Blowfish");
            IllIllIIlllllll.init(ChatUtil.IIIl[2], lllIllIIlllllll);
            return new String(IllIllIIlllllll.doFinal(Base64.getDecoder().decode(IIlIllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIIlllllll) {
            lIlIllIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIll(String lllllIIIlllllll, final String llIIIlIIlllllll) {
        lllllIIIlllllll = (boolean)new String(Base64.getDecoder().decode(((String)lllllIIIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIIlIIlllllll = new StringBuilder();
        final char[] lIIIIlIIlllllll = llIIIlIIlllllll.toCharArray();
        int IIIIIlIIlllllll = ChatUtil.IIIl[0];
        final byte IlIllIIIlllllll = (Object)((String)lllllIIIlllllll).toCharArray();
        final byte lIIllIIIlllllll = (byte)IlIllIIIlllllll.length;
        short IIIllIIIlllllll = (short)ChatUtil.IIIl[0];
        while (IIlll(IIIllIIIlllllll, lIIllIIIlllllll)) {
            final char lIlIIlIIlllllll = IlIllIIIlllllll[IIIllIIIlllllll];
            IlIIIlIIlllllll.append((char)(lIlIIlIIlllllll ^ lIIIIlIIlllllll[IIIIIlIIlllllll % lIIIIlIIlllllll.length]));
            "".length();
            ++IIIIIlIIlllllll;
            ++IIIllIIIlllllll;
            "".length();
            if ((0x6A ^ 0x56 ^ (0x9C ^ 0xA4)) < (126 + 120 - 214 + 102 ^ 103 + 5 - 13 + 35)) {
                return null;
            }
        }
        return String.valueOf(IlIIIlIIlllllll);
    }
    
    static {
        llIll();
        IlIll();
    }
}

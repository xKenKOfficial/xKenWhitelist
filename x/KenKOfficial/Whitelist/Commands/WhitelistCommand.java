package x.KenKOfficial.Whitelist.Commands;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.command.*;
import x.KenKOfficial.Whitelist.Main.*;
import x.KenKOfficial.Whitelist.Utils.*;
import x.KenKOfficial.Whitelist.Apis.*;
import java.util.*;

public class WhitelistCommand implements CommandExecutor
{
    private static final /* synthetic */ int[] lIll;
    private static final /* synthetic */ String[] IIll;
    
    static {
        IlIlIl();
        lIIlIl();
    }
    
    private static String IllIIl(final String IlIlIlIIIllllll, final String lIIlIlIIIllllll) {
        try {
            final SecretKeySpec llllIlIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlllIlIIIllllll = Cipher.getInstance("Blowfish");
            IlllIlIIIllllll.init(WhitelistCommand.lIll[2], llllIlIIIllllll);
            return new String(IlllIlIIIllllll.doFinal(Base64.getDecoder().decode(IlIlIlIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlIIIllllll) {
            lIllIlIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static void IlIlIl() {
        (lIll = new int[24])[0] = ((0xF4 ^ 0xBC ^ (0x34 ^ 0x2F)) & (141 + 127 - 238 + 121 ^ 169 + 71 - 143 + 99 ^ -" ".length()));
        WhitelistCommand.lIll[1] = " ".length();
        WhitelistCommand.lIll[2] = "  ".length();
        WhitelistCommand.lIll[3] = "   ".length();
        WhitelistCommand.lIll[4] = (56 + 91 - 135 + 166 ^ 111 + 42 - 91 + 120);
        WhitelistCommand.lIll[5] = (0x11 ^ 0x14);
        WhitelistCommand.lIll[6] = (0x15 ^ 0x13);
        WhitelistCommand.lIll[7] = (0xAF ^ 0xA8);
        WhitelistCommand.lIll[8] = (101 + 125 - 195 + 141 ^ 40 + 103 - 130 + 151);
        WhitelistCommand.lIll[9] = (0xB5 ^ 0xAF ^ (0x25 ^ 0x36));
        WhitelistCommand.lIll[10] = (0xA7 ^ 0xC7 ^ (0xAA ^ 0xC0));
        WhitelistCommand.lIll[11] = (0x6D ^ 0x66);
        WhitelistCommand.lIll[12] = (154 + 102 - 215 + 124 ^ 119 + 59 - 88 + 79);
        WhitelistCommand.lIll[13] = (0x4A ^ 0x47);
        WhitelistCommand.lIll[14] = (0x2B ^ 0x48 ^ (0x5E ^ 0x33));
        WhitelistCommand.lIll[15] = (0x22 ^ 0x2D);
        WhitelistCommand.lIll[16] = (16 + 77 + 31 + 7 ^ 22 + 80 + 22 + 23);
        WhitelistCommand.lIll[17] = (0xAD ^ 0xBC);
        WhitelistCommand.lIll[18] = (105 + 37 - 18 + 13 ^ 74 + 68 + 7 + 6);
        WhitelistCommand.lIll[19] = (0x19 ^ 0x17 ^ (0xAB ^ 0xB6));
        WhitelistCommand.lIll[20] = (0x63 ^ 0x77);
        WhitelistCommand.lIll[21] = (0x3F ^ 0x2A);
        WhitelistCommand.lIll[22] = (0x46 ^ 0x55 ^ (0x42 ^ 0x47));
        WhitelistCommand.lIll[23] = (0x67 ^ 0x70);
    }
    
    private static boolean IlllIl(final Object IIlIlIIIIllllll) {
        return IIlIlIIIIllllll == null;
    }
    
    private static boolean IIllIl(final int lllIlIIIIllllll, final int IllIlIIIIllllll) {
        return lllIlIIIIllllll < IllIlIIIIllllll;
    }
    
    public boolean onCommand(final CommandSender IIlIlIlIIllllll, final Command IIlllIlIIllllll, final String llIllIlIIllllll, final String[] llIIlIlIIllllll) {
        final String lIIllIlIIllllll = Main.getPlugin().getConfig().getString(WhitelistCommand.IIll[WhitelistCommand.lIll[0]]);
        final String IIIllIlIIllllll = Main.getPlugin().getConfig().getString(WhitelistCommand.IIll[WhitelistCommand.lIll[1]]);
        if (llIlIl(IIlIlIlIIllllll.hasPermission(WhitelistCommand.IIll[WhitelistCommand.lIll[2]]) ? 1 : 0)) {
            IIlIlIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(lIIllIlIIllllll).append(WhitelistCommand.IIll[WhitelistCommand.lIll[3]]).append(IIIllIlIIllllll))));
            return WhitelistCommand.lIll[1] != 0;
        }
        final String lllIlIlIIllllll = Main.getPlugin().getConfig().getString(WhitelistCommand.IIll[WhitelistCommand.lIll[4]]);
        if (IIllIl(llIIlIlIIllllll.length, WhitelistCommand.lIll[1])) {
            IIlIlIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(lIIllIlIIllllll).append(WhitelistCommand.IIll[WhitelistCommand.lIll[5]]).append(lllIlIlIIllllll))));
            return WhitelistCommand.lIll[1] != 0;
        }
        final String IllIlIlIIllllll = Main.getPlugin().getConfig().getString(WhitelistCommand.IIll[WhitelistCommand.lIll[6]]);
        final String lIlIlIlIIllllll = Main.getPlugin().getConfig().getString(WhitelistCommand.IIll[WhitelistCommand.lIll[7]]);
        if (lIllIl(llIIlIlIIllllll[WhitelistCommand.lIll[0]].equalsIgnoreCase(WhitelistCommand.IIll[WhitelistCommand.lIll[8]]) ? 1 : 0)) {
            API.statusWhitelist((boolean)(WhitelistCommand.lIll[1] != 0));
            IIlIlIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(lIIllIlIIllllll).append(WhitelistCommand.IIll[WhitelistCommand.lIll[9]]).append(IllIlIlIIllllll))));
            return WhitelistCommand.lIll[1] != 0;
        }
        if (lIllIl(llIIlIlIIllllll[WhitelistCommand.lIll[0]].equalsIgnoreCase(WhitelistCommand.IIll[WhitelistCommand.lIll[10]]) ? 1 : 0)) {
            API.statusWhitelist((boolean)(WhitelistCommand.lIll[0] != 0));
            IIlIlIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(lIIllIlIIllllll).append(WhitelistCommand.IIll[WhitelistCommand.lIll[11]]).append(lIlIlIlIIllllll))));
            return WhitelistCommand.lIll[1] != 0;
        }
        if (lIllIl(llIIlIlIIllllll[WhitelistCommand.lIll[0]].equalsIgnoreCase(WhitelistCommand.IIll[WhitelistCommand.lIll[12]]) ? 1 : 0)) {
            final String IlIIIllIIllllll = llIIlIlIIllllll[WhitelistCommand.lIll[1]];
            if (IlllIl(IlIIIllIIllllll)) {
                IIlIlIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(lIIllIlIIllllll).append(WhitelistCommand.IIll[WhitelistCommand.lIll[13]]).append(lllIlIlIIllllll))));
                return WhitelistCommand.lIll[0] != 0;
            }
            final String lIIIIllIIllllll = Main.getPlugin().getConfig().getString(WhitelistCommand.IIll[WhitelistCommand.lIll[14]]).replace(WhitelistCommand.IIll[WhitelistCommand.lIll[15]], IlIIIllIIllllll);
            API.addWhitelistPlayer(IlIIIllIIllllll);
            IIlIlIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(lIIllIlIIllllll).append(WhitelistCommand.IIll[WhitelistCommand.lIll[16]]).append(lIIIIllIIllllll))));
            "".length();
            if ((0xB8 ^ 0xBC) > (0x39 ^ 0x3D)) {
                return ((0x25 ^ 0x71) & ~(0xD7 ^ 0x83)) != 0x0;
            }
        }
        else if (lIllIl(llIIlIlIIllllll[WhitelistCommand.lIll[0]].equalsIgnoreCase(WhitelistCommand.IIll[WhitelistCommand.lIll[17]]) ? 1 : 0)) {
            final String IIIIIllIIllllll = llIIlIlIIllllll[WhitelistCommand.lIll[1]];
            if (IlllIl(IIIIIllIIllllll)) {
                IIlIlIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(lIIllIlIIllllll).append(WhitelistCommand.IIll[WhitelistCommand.lIll[18]]).append(lllIlIlIIllllll))));
                return WhitelistCommand.lIll[0] != 0;
            }
            final String lllllIlIIllllll = Main.getPlugin().getConfig().getString(WhitelistCommand.IIll[WhitelistCommand.lIll[19]]).replace(WhitelistCommand.IIll[WhitelistCommand.lIll[20]], IIIIIllIIllllll);
            API.removeWhitelistPlayer(IIIIIllIIllllll);
            IIlIlIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(lIIllIlIIllllll).append(WhitelistCommand.IIll[WhitelistCommand.lIll[21]]).append(lllllIlIIllllll))));
            "".length();
            if (((0x9B ^ 0x80) & ~(0x7E ^ 0x65)) < -" ".length()) {
                return ((0xA4 ^ 0x9C) & ~(0x16 ^ 0x2E)) != 0x0;
            }
        }
        else {
            IIlIlIlIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(lIIllIlIIllllll).append(WhitelistCommand.IIll[WhitelistCommand.lIll[22]]).append(lllIlIlIIllllll))));
        }
        return WhitelistCommand.lIll[0] != 0;
    }
    
    private static void lIIlIl() {
        (IIll = new String[WhitelistCommand.lIll[23]])[WhitelistCommand.lIll[0]] = IllIIl("Ffe61R7DARM=", "kVncE");
        WhitelistCommand.IIll[WhitelistCommand.lIll[1]] = IllIIl("tbgrRDDHEXgQJ+RliapyZQ==", "SRvcb");
        WhitelistCommand.IIll[WhitelistCommand.lIll[2]] = IllIIl("eTpa2T/NNgl5uiWAh2VQT6Vf3uveHqQA", "fCGPN");
        WhitelistCommand.IIll[WhitelistCommand.lIll[3]] = IllIIl("pj/jA3iGBy8=", "ceEaY");
        WhitelistCommand.IIll[WhitelistCommand.lIll[4]] = IllIIl("ZMa/ZUsG6FnZY2ZLVd7ipQ==", "WZNKr");
        WhitelistCommand.IIll[WhitelistCommand.lIll[5]] = IllIIl("V5UHY+K0pAE=", "IVRWR");
        WhitelistCommand.IIll[WhitelistCommand.lIll[6]] = IllIIl("TxbRn7Lh5R+BMCdeMOidWQ==", "NyppP");
        WhitelistCommand.IIll[WhitelistCommand.lIll[7]] = lllIIl("N24ND8UXrtrof4zG19jFGA==", "edBgb");
        WhitelistCommand.IIll[WhitelistCommand.lIll[8]] = lllIIl("76xZCBK/VlI=", "dTFpZ");
        WhitelistCommand.IIll[WhitelistCommand.lIll[9]] = IllIIl("1vaMTrpdxTM=", "YstBh");
        WhitelistCommand.IIll[WhitelistCommand.lIll[10]] = lllIIl("MWF/6XphVoQ=", "FMMPw");
        WhitelistCommand.IIll[WhitelistCommand.lIll[11]] = IllIIl("wpu1uJojuro=", "ppBSs");
        WhitelistCommand.IIll[WhitelistCommand.lIll[12]] = IIIlIl("KwMX", "Jgsif");
        WhitelistCommand.IIll[WhitelistCommand.lIll[13]] = lllIIl("vbeAch7Vg9A=", "TnKeS");
        WhitelistCommand.IIll[WhitelistCommand.lIll[14]] = IIIlIl("MQI/PycqAyU/HScOMhQyKgsvLjA=", "FjVKB");
        WhitelistCommand.IIll[WhitelistCommand.lIll[15]] = IllIIl("3+VtNIeM4JHCOri+3PRjTg==", "xtrfm");
        WhitelistCommand.IIll[WhitelistCommand.lIll[16]] = IllIIl("wp3HRmVFVjc=", "vUrRZ");
        WhitelistCommand.IIll[WhitelistCommand.lIll[17]] = lllIIl("p7Wp/d7CH/g=", "IolPS");
        WhitelistCommand.IIll[WhitelistCommand.lIll[18]] = IllIIl("Xj2HchBjDkc=", "hQjYw");
        WhitelistCommand.IIll[WhitelistCommand.lIll[19]] = IllIIl("k1hC8RoPKaclw0mRWltf3eTu+j5s3I4H", "UPuXw");
        WhitelistCommand.IIll[WhitelistCommand.lIll[20]] = IllIIl("yKiWG48UfN3G9IBgrHgSmg==", "zllxv");
        WhitelistCommand.IIll[WhitelistCommand.lIll[21]] = IIIlIl("eA==", "XIbyp");
        WhitelistCommand.IIll[WhitelistCommand.lIll[22]] = lllIIl("RkFEeIiPQzM=", "RHtXe");
    }
    
    private static boolean llIlIl(final int IIIIlIIIIllllll) {
        return IIIIlIIIIllllll == 0;
    }
    
    private static String IIIlIl(String IIllllIIIllllll, final String IIIIIIlIIllllll) {
        IIllllIIIllllll = (boolean)new String(Base64.getDecoder().decode(((String)IIllllIIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllIIIllllll = new StringBuilder();
        final char[] IlllllIIIllllll = IIIIIIlIIllllll.toCharArray();
        int lIllllIIIllllll = WhitelistCommand.lIll[0];
        final boolean lllIllIIIllllll = (Object)((String)IIllllIIIllllll).toCharArray();
        final float IllIllIIIllllll = lllIllIIIllllll.length;
        String lIlIllIIIllllll = (String)WhitelistCommand.lIll[0];
        while (IIllIl((int)lIlIllIIIllllll, (int)IllIllIIIllllll)) {
            final char IlIIIIlIIllllll = lllIllIIIllllll[lIlIllIIIllllll];
            llllllIIIllllll.append((char)(IlIIIIlIIllllll ^ IlllllIIIllllll[lIllllIIIllllll % IlllllIIIllllll.length]));
            "".length();
            ++lIllllIIIllllll;
            ++lIlIllIIIllllll;
            "".length();
            if ("   ".length() <= ((0x1C ^ 0x59 ^ (0xD9 ^ 0x87)) & (0x2E ^ 0x2 ^ (0x38 ^ 0xF) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllIIIllllll);
    }
    
    private static boolean lIllIl(final int IlIIlIIIIllllll) {
        return IlIIlIIIIllllll != 0;
    }
    
    private static String lllIIl(final String lllllIIIIllllll, final String IllllIIIIllllll) {
        try {
            final SecretKeySpec IlIIIlIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllllIIIIllllll.getBytes(StandardCharsets.UTF_8)), WhitelistCommand.lIll[8]), "DES");
            final Cipher lIIIIlIIIllllll = Cipher.getInstance("DES");
            lIIIIlIIIllllll.init(WhitelistCommand.lIll[2], IlIIIlIIIllllll);
            return new String(lIIIIlIIIllllll.doFinal(Base64.getDecoder().decode(lllllIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIlIIIllllll) {
            IIIIIlIIIllllll.printStackTrace();
            return null;
        }
    }
}

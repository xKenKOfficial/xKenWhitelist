package x.KenKOfficial.Whitelist.Files;

import org.bukkit.plugin.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.configuration.file.*;
import org.bukkit.*;
import java.io.*;

public class WhitelistFile
{
    /* synthetic */ FileConfiguration data;
    private static final /* synthetic */ int[] IlIl;
    static /* synthetic */ WhitelistFile instance;
    private static final /* synthetic */ String[] lIIl;
    public static /* synthetic */ File rfile;
    
    private static String lIlll(final String lIIlIIllIllllll, final String IIIlIIllIllllll) {
        try {
            final SecretKeySpec IlllIIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIlIIllIllllll.getBytes(StandardCharsets.UTF_8)), WhitelistFile.IlIl[5]), "DES");
            final Cipher lIllIIllIllllll = Cipher.getInstance("DES");
            lIllIIllIllllll.init(WhitelistFile.IlIl[2], IlllIIllIllllll);
            return new String(lIllIIllIllllll.doFinal(Base64.getDecoder().decode(lIIlIIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIIllIllllll) {
            IIllIIllIllllll.printStackTrace();
            return null;
        }
    }
    
    public void reloadData() {
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(WhitelistFile.rfile);
    }
    
    private static String lllll(final String IIIllIllIllllll, final String lllIlIllIllllll) {
        try {
            final SecretKeySpec llIllIllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIllIllIllllll = Cipher.getInstance("Blowfish");
            IlIllIllIllllll.init(WhitelistFile.IlIl[2], llIllIllIllllll);
            return new String(IlIllIllIllllll.doFinal(Base64.getDecoder().decode(IIIllIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIllIllllll) {
            lIIllIllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIl(final int llIIIIllIllllll, final int IlIIIIllIllllll) {
        return llIIIIllIllllll < IlIIIIllIllllll;
    }
    
    public static WhitelistFile getInstance() {
        return WhitelistFile.instance;
    }
    
    private static String Illll(String IIIlIlllIllllll, final String lllIIlllIllllll) {
        IIIlIlllIllllll = (byte)new String(Base64.getDecoder().decode(((String)IIIlIlllIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llIlIlllIllllll = new StringBuilder();
        final char[] IlIlIlllIllllll = lllIIlllIllllll.toCharArray();
        int lIIlIlllIllllll = WhitelistFile.IlIl[0];
        final byte llIIIlllIllllll = (Object)((String)IIIlIlllIllllll).toCharArray();
        final int IlIIIlllIllllll = llIIIlllIllllll.length;
        Exception lIIIIlllIllllll = (Exception)WhitelistFile.IlIl[0];
        while (llIIIl((int)lIIIIlllIllllll, IlIIIlllIllllll)) {
            final char IlllIlllIllllll = llIIIlllIllllll[lIIIIlllIllllll];
            llIlIlllIllllll.append((char)(IlllIlllIllllll ^ IlIlIlllIllllll[lIIlIlllIllllll % IlIlIlllIllllll.length]));
            "".length();
            ++lIIlIlllIllllll;
            ++lIIIIlllIllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llIlIlllIllllll);
    }
    
    private static boolean IlIIIl(final int IIIIIIllIllllll) {
        return IIIIIIllIllllll == 0;
    }
    
    public void setup(final Plugin IllIIIIIlllllll) {
        if (IlIIIl(IllIIIIIlllllll.getDataFolder().exists() ? 1 : 0)) {
            IllIIIIIlllllll.getDataFolder().mkdir();
            "".length();
        }
        final File IIIlIIIIlllllll = new File(String.valueOf(new StringBuilder().append(IllIIIIIlllllll.getDataFolder()).append(File.separator).append(WhitelistFile.lIIl[WhitelistFile.IlIl[0]])));
        WhitelistFile.rfile = new File(IIIlIIIIlllllll, String.valueOf(String.valueOf(new StringBuilder().append(String.valueOf(File.separatorChar)).append(WhitelistFile.lIIl[WhitelistFile.IlIl[1]]))));
        if (IlIIIl(WhitelistFile.rfile.exists() ? 1 : 0)) {
            try {
                IIIlIIIIlllllll.mkdirs();
                "".length();
                WhitelistFile.rfile.createNewFile();
                "".length();
                "".length();
                if ("  ".length() > "   ".length()) {
                    return;
                }
            }
            catch (IOException llIlIIIIlllllll) {
                Bukkit.getServer().getLogger().severe(WhitelistFile.lIIl[WhitelistFile.IlIl[2]]);
            }
        }
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(WhitelistFile.rfile);
    }
    
    public void saveData() {
        try {
            this.data.save(WhitelistFile.rfile);
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        catch (IOException IlllllllIllllll) {
            Bukkit.getServer().getLogger().severe(WhitelistFile.lIIl[WhitelistFile.IlIl[3]]);
        }
    }
    
    private static void lIIIIl() {
        (IlIl = new int[6])[0] = ((0x9F ^ 0x97) & ~(0x15 ^ 0x1D));
        WhitelistFile.IlIl[1] = " ".length();
        WhitelistFile.IlIl[2] = "  ".length();
        WhitelistFile.IlIl[3] = "   ".length();
        WhitelistFile.IlIl[4] = (0x38 ^ 0x8 ^ (0x3C ^ 0x8));
        WhitelistFile.IlIl[5] = (0x7C ^ 0x74);
    }
    
    static {
        lIIIIl();
        IIIIIl();
        WhitelistFile.instance = new WhitelistFile();
    }
    
    private static void IIIIIl() {
        (lIIl = new String[WhitelistFile.IlIl[4]])[WhitelistFile.IlIl[0]] = lIlll("jupxl0T/gbEsygBt+P8Evg==", "UKUkO");
        WhitelistFile.lIIl[WhitelistFile.IlIl[1]] = lIlll("v62t7ALAAneBHtDzbCDHCA==", "nkwav");
        WhitelistFile.lIIl[WhitelistFile.IlIl[2]] = Illll("LxUUHy1MFA4HaQAVABdpGxIIBywAExIHZxUXDQ==", "lzasI");
        WhitelistFile.lIIl[WhitelistFile.IlIl[3]] = lllll("EAYlCnh03sbcLGsY4jUWLPnyLDEslpXJKWsOcJqe25E=", "PyqoM");
    }
    
    public FileConfiguration getFile() {
        return this.data;
    }
}

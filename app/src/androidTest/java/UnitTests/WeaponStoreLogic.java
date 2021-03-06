package UnitTests;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.DeathStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.Equipment;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.KillStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.KillstreakLoadout;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PerkLoadout;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PrimaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SecondaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SpecialGrenade;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.WeaponAttachments;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponStores.WeaponStore;

import junit.framework.TestCase;

public class WeaponStoreLogic extends TestCase {
    WeaponStore ws = new WeaponStore(0);

    public void testReturnsDistinctKillstreamInAscendingOrder() {

        KillstreakLoadout kl = ws.getKillstreakLoadout();

        KillStreak k1 = kl.getKillStreak(1);
        KillStreak k2 = kl.getKillStreak(2);
        KillStreak k3 = kl.getKillStreak(3);

        assertFalse(k1.getName().equals(k2.getName()));
        assertFalse(k1.getName().equals(k3.getName()));
        assertFalse(k2.getName().equals(k3.getName()));

        assertTrue(kl.getKillStreak(1).getKillsRequired() <= kl.getKillStreak(2).getKillsRequired());
        assertTrue(kl.getKillStreak(2).getKillsRequired() <= kl.getKillStreak(3).getKillsRequired());
    }

    public void testReturnsCorrectCombinationOfPerks() {
        PerkLoadout ps = ws.getPerkLoadout();

        assertEquals(1, ps.getPerk(1).getCategory());
        assertEquals(2, ps.getPerk(2).getCategory());
        assertEquals(3, ps.getPerk(3).getCategory());
    }

    public void testCanGetLoadoutElements() {
        DeathStreak d = ws.getDeathStreak();
        PrimaryWeapon p = ws.getPrimaryWeapon();
        SecondaryWeapon s = ws.getSecondaryWeapon();
        Equipment e = ws.getEquipment();
        SpecialGrenade sp = ws.getSpecialGrenade();

        assertNotNull(d);
        assertNotNull(p);
        assertNotNull(s);
        assertNotNull(e);
        assertNotNull(sp);
    }

    public void testCanSelectAttachments() {
        WeaponAttachments p1 = ws.getPrimaryAttachment1(ws.getPrimaryWeapon());
        WeaponAttachments s1 = ws.getSecondaryAttachment1(ws.getSecondaryWeapon());

        assertNotNull(p1);
        assertNotNull(s1);
    }

    public void testDistinctNumbers() {
        WeaponStore ws = new WeaponStore(70);
        for(int i = 0; i < 100; i++) {
            int[] ns = ws.getDistinctNumbers(3, 15);

            assert(ns[0] != ns[1] && ns[1] != ns[2] && ns[0] != ns[2]);
        }

    }

}

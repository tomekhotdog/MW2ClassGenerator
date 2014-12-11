package UnitTests;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.KillStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.KillstreamLoadout;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponStore;

import junit.framework.TestCase;

public class WeaponStoreLogic extends TestCase {

    public void testReturnsDistinctKillstreamInAscendingOrder() {
        WeaponStore ws = new WeaponStore();
        KillstreamLoadout kl = ws.getKillstreakLoadout(0);

        KillStreak k1 = kl.getKillStreak(1);
        KillStreak k2 = kl.getKillStreak(2);
        KillStreak k3 = kl.getKillStreak(3);

        assertFalse(k1.getName().equals(k2.getName()));
        assertFalse(k1.getName().equals(k3.getName()));
        assertFalse(k2.getName().equals(k3.getName()));

        assertTrue(kl.getKillStreak(1).getLevelUnlocked() <= kl.getKillStreak(2).getLevelUnlocked());
        assertTrue(kl.getKillStreak(2).getLevelUnlocked() <= kl.getKillStreak(3).getLevelUnlocked());
    }
}

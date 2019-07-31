package jadx.gui.utils;

import java.util.ArrayList;

import javax.swing.Icon;

import org.junit.Assert;
import org.junit.Test;

public class OverlayIconTest {

	@Test
	public void testGetIcons() {
		final OverlayIcon objectUnderTest = new OverlayIcon(null);
		objectUnderTest.add(null);

		final ArrayList<Icon> arrayList = new ArrayList<>();
		arrayList.add(null);

		Assert.assertEquals(arrayList, objectUnderTest.getIcons());
		Assert.assertEquals(new ArrayList<Icon>(), new OverlayIcon(null, new Icon[] {}).getIcons());
		Assert.assertEquals(new ArrayList<Icon>(), new OverlayIcon(null).getIcons());
	}
}
public class CustomEnchantsAPI {

	/**
	 * 
	 * @param player  The player being shown the Gui
	 * @param guiType The type of Gui to open
	 */
	public static void openGui(Player player, CustomEnchantGui guiType) {
	}

	/**
	 * 
	 * @param enchant
	 * @return True if the enchantment is a custom enchantment
	 */
	public static boolean isCustomEnchantment(Enchantment enchant) {
	}

	/**
	 * 
	 * @param type
	 * @return True if the material has available enchantments
	 */
	public static boolean isEnchantableMaterial(Material type) {
	}

	/**
	 * @param type
	 * @param enchant
	 * @return True if the enchantment can be applied to the material
	 */
	public static boolean enchantIsCompatible(Material type, Enchantment enchant) {
	}

	/**
	 * 
	 * @param item
	 * @return A list of enchantments that can be applied to the item
	 */
	public static List<Enchantment> getCustomEnchantmentsAvailable(ItemStack item) {
	}

	/**
	 * @param item
	 * @return A list of custom enchantments the item has
	 */
	public static List<Enchantment> getCustomEnchantments(ItemStack item) {
	}

	/**
	 * @param enchant
	 * @return The rarity of the enchantment
	 */
	public static CustomEnchantmentRarity getEnchantmentRarity(Enchantment enchant) {
	}

	/**
	 * 
	 * @param item A custom enchanted item
	 * @return Generated custom lore
	 */
	public static List<String> getFullCustomLore(ItemStack item) {
	}

	/**
	 * 
	 * @param item
	 * @return The amount of slots taken up on an item
	 */
	public static int getUsedSlots(ItemStack item) {
	}

	/**
	 * 
	 * @param item
	 * @return The max amount of slots for an item
	 */
	public static int getMaxSlots(ItemStack item) {
	}

	/**
	 * 
	 * @param item
	 * @param maxSlots The desired amount of max slots on an item
	 */
	public static void setMaxSlots(ItemStack item, int maxSlots) {
	}

	/**
	 * 
	 * @param rarity
	 * @return The prefix for the rarity defined within messages.yml
	 */
	public static String getRarityPrefix(CustomEnchantmentRarity rarity) {
	}

	/**
	 * 
	 * @param item
	 * @param usedSlots
	 * @param maxSlots
	 * @return A line within the lore of an item that gives slot status of an item
	 */
	public static String getLoreSlotsLine(ItemStack item, int usedSlots, int maxSlots) {
	}

	/**
	 * 
	 * @param item
	 * @return True if the lore of an item could be updated
	 */
	public static boolean loreUpdateAvailable(ItemStack item) {
	}

	/**
	 * 
	 * @param player    The player that will have their inventories updated
	 * @param inventory The inventory to update items within
	 */
	public static void updateItemLores(Player player, Inventory inventory) {
	}
}

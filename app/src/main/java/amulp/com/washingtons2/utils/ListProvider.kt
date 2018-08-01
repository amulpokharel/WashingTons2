package amulp.com.washingtons2.utils

import amulp.com.washingtons2.models.ListItem


object ListProvider {
    fun getWasherList(): List<ListItem> {
        val washList = mutableListOf<ListItem>()

        washList.add(ListItem(
                "A",
                "Machine Wash, Normal",
                "May be laundered with the hottest available water, detergent or soap, and agitation"))

        washList.add(ListItem(
                "L",
                "Machine Wash, Cold",
                "Initial water temperature should not exceed 30C or 65 to 85F."))

        washList.add(ListItem(
                "K",
                "Machine Wash, Warm",
                "Initial water temperature should not exceed 40C or 105F."))

        washList.add(ListItem(
                "J",
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 50C or 120F."))

        washList.add(ListItem(
                "I",
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 60C or 140F."))

        washList.add(ListItem(
                "H",
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 70C or 160F."))

        washList.add(ListItem(
                "G",
                "Machine Wash, Hot",
                "Initial water temperature should not exceed 95C or 200F."))

        washList.add(ListItem(
                "B",
                "Machine Wash, Permanent Press",
                "Only on Permanent Press with cool down or cold rinse prior to reduced spin."))

        washList.add(ListItem(
                "C",
                "Machine Wash, Machine Wash, Gentle or Delicate",
                "Only on the setting designed for gentle agitation and/or reduced time for delicate items."))

        washList.add(ListItem(
                "D",
                "Hand Wash",
                "Laundered through the use of water, detergent or soap and gentle hand manipulation."))

        washList.add(ListItem(
                "E",
                "Do Not Wash",
                "May not be safely laundered. Possibly dry clean"))

        washList.add(ListItem(
                "F",
                "Do Not Wring",
                "Do not wring by hand or use rollers on wringer washer. Hang dry, drip dry or dry flat."))

        washList.add(ListItem(
                "b",
                "Bleach When Needed",
                "Any commercially available bleach product may be used in the laundering process."))

        washList.add(ListItem(
                "c",
                "Non-Chlorine Bleach When Needed",
                "Only a non-chlorine, color-safe bleach may be used in the laundering process."))

        washList.add(ListItem(
                "d",
                "Do Not Bleach",
                "No bleach product may be used."))

        return washList
    }


    fun getDryerList(): List<ListItem> {
        val dryList = mutableListOf<ListItem>()

        dryList.add(ListItem(
                "N",
                "Tumble Dry, Normal",
                "A machine dryer may be regularly used at the hottest available temperature setting"))

        dryList.add(ListItem(
                "U",
                "Tumble Dry, Normal, Low Heat",
                "A machine dryer may be regularly used at a maximum of Low Heat setting"))

        dryList.add(ListItem(
                "T",
                "Tumble Dry, Normal, Medium Heat",
                "A machine dryer may be regularly used at a maximum of Medium Heat setting"))

        dryList.add(ListItem(
                "S",
                "Tumble Dry, Normal, High Heat",
                "A machine dryer may be regularly used at a High Heat setting"))

        dryList.add(ListItem(
                "V",
                "Tumble Dry, Normal, No Heat",
                "A machine dryer may be regularly used only at No Heat or Air Only setting"))

        dryList.add(ListItem(
                "O",
                "Tumble Dry, Permanent Press",
                "A machine dryer may be regularly used only at the Permanent Press setting"))

        dryList.add(ListItem(
                "P",
                "Tumble Dry, Gentle",
                "A machine dryer may be regularly used only at the Gentle setting"))

        dryList.add(ListItem(
                "Q",
                "Do Not Tumble Dry",
                "A machine dryer may not be used. Usually accompanied by an alternate drying method symbol"))

        dryList.add(ListItem(
                "W",
                "Do Not Dry",
                "A machine dryer may not be used. Usually accompanied by an alternate drying method symbol"))

        dryList.add(ListItem(
                "X",
                "Line Dry",
                "Hang damp garment from line or bar, in or out doors"))

        dryList.add(ListItem(
                "Y",
                "Drip Dry",
                "Hang dripping wet garment from line or bar, in or out doors, without hand shaping or smoothing"))

        dryList.add(ListItem(
                "Z",
                "Dry Flat",
                "Lay out horizontally for drying"))

        dryList.add(ListItem(
                "a",
                "Dry In Shade",
                "Usually added to Line or Drip Dry. Dry away from direct sunlight"))

        return dryList
    }


    fun getOtherList(): List<ListItem> {
        val otherList = mutableListOf<ListItem>()

        otherList.add(ListItem("e",
                "Iron, Any Temperature, Steam or Dry",
                "Regular ironing may be needed and may be performed at any available temperature with or without steam is acceptable"))

        otherList.add(ListItem("h",
                "Iron, Low",
                "Regular ironing, steam or dry, may be performed at Low setting (110C, 230F) only"))

        otherList.add(ListItem("g",
                "Iron, Medium",
                "Regular ironing, steam or dry, may be performed at Medium setting (150C, 300F)"))

        otherList.add(ListItem(
                "f",
                "Iron, High",
                "Regular ironing, steam or dry, may be performed at High setting (200C, 290F)"))

        otherList.add(ListItem(
                "j",
                "Do Not Steam",
                "Steam ironing will harm garment, but regular dry ironing at indicated temperature setting is acceptable"))

        otherList.add(ListItem(
                "i",
                "Do Not Iron",
                "Item may not be smoothed or finished with an iron"))

        otherList.add(ListItem(
                "k",
                "Dryclean",
                "Dry Clean, any solvent, any cycle any moisture, any heat"))

        otherList.add(ListItem(
                "l",
                "Dryclean, Any Solvent",
                "Dry Clean, any solvent. Usually used with other restrictions on proper dry cleaning procedure"))

        otherList.add(ListItem(
                "n",
                "Dryclean, Petroleum Solvent Only",
                "Dry Clean using only petroleum solvent. Usually used with other restrictions"))

        otherList.add(ListItem(
                "m",
                "Dryclean, Any Solvent Except Trichloroethylene",
                "Any dry cleaning solvent other than trichloroethylene may be safely used"))

        otherList.add(ListItem(
                "q",
                "Dryclean, Short Cycle",
                "May be used with A, P, or F solvent restriction"))

        otherList.add(ListItem(
                "p",
                "Dryclean, Reduced Moisture",
                "May be used with A, P, or F solvent restriction"))

        otherList.add(ListItem(
                "s",
                "Dryclean, Low Heat",
                "May be used with A, P, or F solvent restriction"))

        otherList.add(ListItem(
                "r",
                "Dryclean, No Steam",
                "May be used with A, P, or F solvent restriction"))

        otherList.add(ListItem(
                "o",
                "Do Not Dryclean",
                "Garment may not be commercially drycleaned"))

        return otherList
    }


}
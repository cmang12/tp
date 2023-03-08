package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.*;
import static seedu.address.logic.commands.CommandTestUtil.EDIT_DESC_AMY;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.RemoveCommand.RemovePersonDescriptor;
import seedu.address.testutil.RemovePersonDescriptorBuilder;
import seedu.address.testutil.TypicalPersons;

public class RemovePersonDescriptorTest {

    @Test
    public void equals() {

        // same values -> returns true
        RemovePersonDescriptor descriptorWithSameValues = new RemovePersonDescriptor(REMOVE_DESC_AMY);
        descriptorWithSameValues.setPerson(TypicalPersons.AMY);
        assertTrue(REMOVE_DESC_AMY.equals(descriptorWithSameValues));

        // same object -> returns true
        assertTrue(REMOVE_DESC_AMY.equals(REMOVE_DESC_AMY));

        // null -> returns false
        assertFalse(REMOVE_DESC_AMY.equals(null));

        // different types -> returns false
        assertFalse(REMOVE_DESC_AMY.equals(5));

        // different values -> returns true
        assertTrue(REMOVE_DESC_AMY.equals(REMOVE_DESC_BOB));

        // different phone -> returns false
        RemovePersonDescriptor editedAmy = new RemovePersonDescriptorBuilder(REMOVE_DESC_AMY).withPerson(TypicalPersons.AMY).withPhone(VALID_PHONE_BOB).build();
        assertFalse(REMOVE_DESC_AMY.equals(editedAmy));

        // same phone -> returns true
        RemovePersonDescriptor editedBob = new RemovePersonDescriptorBuilder(REMOVE_DESC_BOB).withPerson(TypicalPersons.BOB).withPhone(VALID_PHONE_BOB).build();
        assertTrue(REMOVE_DESC_BOB.equals(editedBob));

        // different email -> returns false
        editedAmy = new RemovePersonDescriptorBuilder(REMOVE_DESC_AMY).withPerson(TypicalPersons.AMY).withEmail(VALID_EMAIL_BOB).build();
        assertFalse(REMOVE_DESC_AMY.equals(editedAmy));

        // different address -> returns false
        editedAmy = new RemovePersonDescriptorBuilder(REMOVE_DESC_AMY).withPerson(TypicalPersons.AMY).withAddress(VALID_ADDRESS_BOB).build();
        assertFalse(REMOVE_DESC_AMY.equals(editedAmy));

        // different tags -> returns false
        editedAmy = new RemovePersonDescriptorBuilder(REMOVE_DESC_AMY).withPerson(TypicalPersons.AMY).withTags(VALID_TAG_HUSBAND).build();
        assertFalse(REMOVE_DESC_AMY.equals(editedAmy));
    }
}

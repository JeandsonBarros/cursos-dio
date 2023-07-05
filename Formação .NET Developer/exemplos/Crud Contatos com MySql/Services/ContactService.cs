using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Schedule.Context;
using Schedule.CustomExceptions;
using Schedule.Models;

namespace Schedule.Services
{
    public class ContactService
    {
        private readonly ScheduleContext _context;
        public ContactService(ScheduleContext context)
        {
            _context = context;
        }

        public Contact SelectContactById(int id)
        {
            Contact contact = _context.Contact.Find(id);
            if (contact == null)
            {
                throw new NotFoundException($"Contact with id {id} not found");
            }

            return contact;
        }

        public List<Contact> SelectAllContacts()
        {
            return _context.Contact.ToList();
        }

        public List<Contact> SelectContactByName(string name)
        {
            return _context.Contact.Where(contact => contact.Name.Contains(name)).ToList();
        }

        public Contact CreateContact(Contact contact)
        {
            _context.Contact.Add(contact);
            _context.SaveChanges();
            return contact;
        }

        public Contact UpdateContact(int id, Contact contact)
        {
            Contact contactDataBase = _context.Contact.Find(id);
            if (contactDataBase == null)
            {
                
                throw new NotFoundException($"Contact with id {id} not found");
            }

            contactDataBase.IsActive = contact.IsActive;
            contactDataBase.Name = contact.Name;
            contactDataBase.Telephone = contact.Telephone;

            _context.Contact.Update(contactDataBase);
            _context.SaveChanges();

            return contactDataBase;

        }

        public void DeleteContact(int id)
        {
            Contact contactDataBase = _context.Contact.Find(id);
            if (contactDataBase == null)
            {
                throw new NotFoundException($"Contact with id {id} not found");
            }
            
            _context.Contact.Remove(contactDataBase);
            _context.SaveChanges();
        }

    }
}
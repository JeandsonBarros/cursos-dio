using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Schedule.Models;
using Schedule.Services;
using Schedule.CustomExceptions;

namespace Controllers
{
    [ApiController]
    [Route("api/contact")]
    public class ContactController : ControllerBase
    {

        private readonly ContactService _contatoService;
        public ContactController(ContactService contatoService)
        {
            _contatoService = contatoService;
        }

        [HttpGet]
        public IActionResult GetAllContacts()
        {
            var contacts = _contatoService.SelectAllContacts();
            return Ok(contacts);
        }

        [HttpGet("find-by-name/{name}")]
        public IActionResult GetContactByName(string name)
        {
            var contacts = _contatoService.SelectContactByName(name);
            return Ok(contacts);
        }

        [HttpPost]
        public IActionResult PostContact(Contact contact)
        {
            _contatoService.CreateContact(contact);
            return CreatedAtAction(nameof(GetById), new { id = contact.Id }, contact);
        }

        [HttpGet("{id}")]
        public IActionResult GetById(int id)
        {
            try
            {
                var contact = _contatoService.SelectContactById(id);
                return Ok(contact);
            }
            catch (NotFoundException ex)
            {
                return NotFound(new MessageResponse(ex.Message, NotFound().StatusCode, DateTime.Now));
            }
        }

        [HttpPut("{id}")]
        public IActionResult PutContact(int id, Contact contact)
        {
            try
            {
                _contatoService.UpdateContact(id, contact);
                return Ok(contact);
            }
            catch (NotFoundException ex)
            {
                return NotFound(new MessageResponse(ex.Message, NotFound().StatusCode, DateTime.Now));
            }
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteContact(int id)
        {
            try
            {
                _contatoService.DeleteContact(id);
                return NoContent();
            }
            catch (NotFoundException ex)
            {
                return NotFound(new MessageResponse(ex.Message, NotFound().StatusCode, DateTime.Now));
            }
        }

    }
}
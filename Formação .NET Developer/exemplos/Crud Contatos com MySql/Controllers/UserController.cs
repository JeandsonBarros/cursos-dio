using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Schedule.Models;
using Schedule.Services;

namespace Integrando_APIs_NET_C__com_Entity_Framework.Controllers
{
    [ApiController]
    [Route("api/user")]
    public class UserController : ControllerBase
    {
        private readonly UserService _userService;
        public UserController(UserService userService){
            _userService = userService;
        }
        [HttpPost("/register")]
        public IActionResult Register(User user){
            System.Console.WriteLine(user.Role);
            return Ok(user);
        }

    }
}
package pyl.arch2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class Controller {
    @Autowired
    private lateinit var userRepo: UserRepo

    @PostMapping
    fun create(@RequestBody user: User): User {
        userRepo.save(user)
        return user
    }

    @GetMapping("/{id}")
    fun find(@PathVariable(value = "id") id: String): User {
        return userRepo.findById(id).orElseThrow { IllegalArgumentException() }
    }

    @GetMapping
    fun findAll(): MutableIterable<User> {
        return userRepo.findAll()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable(value = "id") id: String) {
        return userRepo.deleteById(id)
    }

    @PutMapping
    fun update(@RequestBody user: User): User {
        return userRepo.save(user)
    }
}
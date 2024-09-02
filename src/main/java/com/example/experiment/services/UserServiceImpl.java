package com.example.experiment.services;

import com.example.experiment.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //@Autowired
    //private UserRepository userRepository;

    //@Autowired
    //private BCryptPasswordEncoder passwordEncoder;

    @Override
    public User registerUser(String email, String password, String role) {
        /*
        // Crear una nueva instancia de User
        User user = new User();

        // Configurar el email del usuario
        user.setEmail(email);

        // Encriptar la contraseña antes de almacenarla
        user.setPassword(passwordEncoder.encode(password));

        // Asignar el rol al usuario
        user.setRole(role);

        // Establecer que el usuario no está bloqueado inicialmente
        user.setBlocked(false);

        // Guardar el usuario en la base de datos utilizando UserRepository
        return userRepository.save(user);
        */
        return null; // Este método devolverá el usuario guardado
    }

    @Override
    public User loginUser(String email, String password) {
        /*
        // Buscar el usuario por email en la base de datos utilizando UserRepository
        Optional<User> optionalUser = userRepository.findByEmail(email);

        // Verificar si el usuario existe y si la contraseña coincide
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();

            // Verificar que la contraseña coincida y que el usuario no esté bloqueado
            if (passwordEncoder.matches(password, user.getPassword()) && !user.isBlocked()) {
                return user; // Devolver el usuario autenticado
            }
        }

        // Si la autenticación falla, devolver null o lanzar una excepción
        */
        return null;
    }

    @Override
    public void assignRole(User user, String role) {
        /*
        // Establecer el nuevo rol al usuario
        user.setRole(role);

        // Guardar los cambios en la base de datos utilizando UserRepository
        userRepository.save(user);
        */
    }

    @Override
    public void blockUser(User user) {
        /*
        // Cambiar el estado de bloqueado del usuario a true
        user.setBlocked(true);

        // Guardar el estado actualizado en la base de datos utilizando UserRepository
        userRepository.save(user);
        */
    }

    @Override
    public void unblockUser(User user) {
        /*
        // Cambiar el estado de bloqueado del usuario a false
        user.setBlocked(false);

        // Guardar el estado actualizado en la base de datos utilizando UserRepository
        userRepository.save(user);
        */
    }

    @Override
    public boolean isUserBlocked(User user) {
        /*
        // Devolver el estado de bloqueo del usuario
        return user.isBlocked();
        */
        return false; // Este método devolverá true si el usuario está bloqueado
    }
}

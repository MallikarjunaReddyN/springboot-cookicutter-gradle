from cookiecutter.main import cookiecutter
import random

server_port = random.randint(1000, 5000)
db_port = random.randint(5001, 9999)

cookiecutter(
		'.\springboot_template',
        extra_context = {'server_port': server_port, 'db_port': db_port}
) 

import os

def replace_last_occurrence(file_path, search_text, replace_text):

    with open(file_path, 'r') as file:
        content = file.read()
    
    last_occurrence = content.rfind(search_text)
    
    if last_occurrence != -1:

        content = content[:last_occurrence] + content[last_occurrence:].replace(search_text, replace_text, 1)
        
        with open(file_path, 'w') as file:
            file.write(content)

def process_folder(folder_path):

    for filename in os.listdir(folder_path):

        file_path = os.path.join(folder_path, filename)
        
        if os.path.isfile(file_path):
            replace_last_occurrence(file_path, 'item', 'id')

folder_path = 'recipe'

process_folder(folder_path)

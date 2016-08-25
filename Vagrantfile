Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/wily64"
  config.vm.synced_folder ".", "/home/vagrant/project"
  config.vm.network "private_network", type: "dhcp"

  config.vm.define "node1"
  config.vm.define "node2"

  config.vm.provider :virtualbox do |vb|
    vb.customize ["setextradata", :id, "VBoxInternal2/SharedFoldersEnableSymlinksCreate/.", "1"]
    vb.memory = 1024
  end

  config.vm.provision "shell", inline: <<-SHELL
      # update APT repositories before installing anything else
      sudo apt-get update
      # install APT https
      sudo apt-get install -y apt-transport-https ca-certificates
      # add GPG key
      sudo apt-key adv --keyserver hkp://p80.pool.sks-keyservers.net:80 --recv-keys 58118E89F3A912897C070ADBF76221572C52609D
      # add Docker APT entry
      echo "deb https://apt.dockerproject.org/repo ubuntu-wily main" | sudo tee /etc/apt/sources.list.d/docker.list
      # update APT repositories
      sudo apt-get update
      # Purge the old repo if it exists
      sudo apt-get purge lxc-docker
      # install docker
      sudo apt-get install -y docker-engine
      # Add vagrant user to docker group
      usermod -a -G docker vagrant
      # Start docker on boot
      sudo systemctl enable docker

      # Install docker Compose
      curl -L https://github.com/docker/compose/releases/download/1.7.1/docker-compose-`uname -s`-`uname -m` | sudo tee /usr/local/bin/docker-compose > /dev/null
      sudo chmod +x /usr/local/bin/docker-compose

  SHELL
end
